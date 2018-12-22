package com.neo.demo;

import org.springframework.boot.ApplicationRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;
import com.neo.demo.model.Car;
import com.neo.demo.model.Result;
import com.neo.demo.repository.CarRepository;
import com.neo.demo.repository.ResultRepository;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {
	
	private static final Logger log=LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ApplicationRunner init(CarRepository repository) {
        return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                      "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                repository.save(car);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
    
    /*@Bean
    ApplicationRunner init(ResultRepository repository,RestTemplate restTemplate) {
        return args -> {
        	
        	Result[] results = restTemplate.getForObject("http://localhost:3000/result", Result[].class);
        	Stream.of(results).forEach(result -> {
        		repository.save(result);
        	});
        	repository.findAll().forEach(System.out::println);
           
        };
    }*/
    
    
    
    
    
}

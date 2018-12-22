package com.neo.demo.controller;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.demo.model.Result;
import com.neo.demo.repository.ResultRepository;

@RestController
public class ResultController {
	
	private ResultRepository repository;
	
	public ResultController(ResultRepository repository) {
        this.repository = repository;
    }
	
	@GetMapping("/cbse-result")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Result> cbseResult() {
		return repository.findAll().stream().collect(Collectors.toList());
	}

}

package com.neo.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	@Id @GeneratedValue
    private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String region;
	private String total_appeared;
	private String total_passed;
	private String total_failed;
	private String percent_appeared;
	private String percent_passed;
	private String percent_failed;
	
	public Result() {
		
	}
	@Override
	public String toString() {
		return "Result [region=" + region + ", total_appeared=" + total_appeared + ", total_passed=" + total_passed
				+ ", total_failed=" + total_failed + ", percent_appeared=" + percent_appeared + ", percent_passed="
				+ percent_passed + ", percent_failed=" + percent_failed + "]";
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getTotal_appeared() {
		return total_appeared;
	}
	public void setTotal_appeared(String total_appeared) {
		this.total_appeared = total_appeared;
	}
	public String getTotal_passed() {
		return total_passed;
	}
	public void setTotal_passed(String total_passed) {
		this.total_passed = total_passed;
	}
	public String getTotal_failed() {
		return total_failed;
	}
	public void setTotal_failed(String total_failed) {
		this.total_failed = total_failed;
	}
	public String getPercent_appeared() {
		return percent_appeared;
	}
	public void setPercent_appeared(String percent_appeared) {
		this.percent_appeared = percent_appeared;
	}
	public String getPercent_passed() {
		return percent_passed;
	}
	public void setPercent_passed(String percent_passed) {
		this.percent_passed = percent_passed;
	}
	public String getPercent_failed() {
		return percent_failed;
	}
	public void setPercent_failed(String percent_failed) {
		this.percent_failed = percent_failed;
	}
	
	
}

package com.example.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Student {
	@NotEmpty(message="Name field is empty")
	public String name;
	@NotEmpty(message="Email field is empty")
	public String email;
	@NotNull(message="Mobileno field is empty")
	public Integer mobileno;
	@NotEmpty(message="Address field is empty")
	public String address;
	
	

}

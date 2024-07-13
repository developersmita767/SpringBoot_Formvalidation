package com.example.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class Student {
	@NotEmpty(message = "Name field is empty")
	private String name;
	@NotNull(message = "Age field is empty")
	private Integer age;
	@NotEmpty(message = "Address field is empty")
	private String address;
}

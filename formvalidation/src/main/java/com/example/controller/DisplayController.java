package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/display")
public class DisplayController {
	
	@GetMapping("/index")
	public String getAboutUsPage( Model model) {
		Student s = new Student();
		model.addAttribute("student",s);
		return "index";
	}
	@PostMapping("/show")
	public String show(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "index";
		}
		System.out.println("Name = "+student.getName());
		System.out.println("Age = "+student.getAge());
		System.out.println("Address = "+student.getAddress());
		return "index";
	}
}


package com.example.spring11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstLesson {
	
	@RequestMapping("/s")
	public String sumOf() {
		return "Good morning";
		
		

	}
}
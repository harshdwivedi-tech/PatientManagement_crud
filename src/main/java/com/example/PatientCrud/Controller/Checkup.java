package com.example.PatientCrud.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checkup {

	@GetMapping("/test")
	public String testing() {
		return "It is working";
	}
}

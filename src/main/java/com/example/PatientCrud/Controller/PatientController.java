package com.example.PatientCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PatientCrud.Entity.Patient;
import com.example.PatientCrud.Service.PatientService;


@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	public PatientService service;
	
	
	@GetMapping
	public List<Patient>GetAllPatient(){
		return service.readAll();
	}

	@GetMapping("/{id}")
	public Patient GetOne(@PathVariable Long id) {
		return service.getOne(id);
	}
	
	@PostMapping
	public Patient SavePatient(@RequestBody Patient pt) {
		return service.insert(pt);
	}
	
	@DeleteMapping("/{id}")
	public void DeletePatient(@PathVariable Long id) {
		service.DeletePatient(id);
	}
}

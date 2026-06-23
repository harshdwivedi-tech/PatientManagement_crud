package com.example.PatientCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientCrud.Entity.Patient;
import com.example.PatientCrud.Repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	public PatientRepository repo;
	
	public List<Patient>readAll(){
		return repo.findAll();
	}
	
	public Patient getOne(Long id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("Not Found")) ;
	}
	
	public Patient insert (Patient pt) {
		return repo.save(pt);
	}
	
	public void DeletePatient(Long id) {
		repo.deleteById(id);
	}
}

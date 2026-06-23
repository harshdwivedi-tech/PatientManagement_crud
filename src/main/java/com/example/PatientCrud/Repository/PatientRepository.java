package com.example.PatientCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PatientCrud.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient , Long>{

}

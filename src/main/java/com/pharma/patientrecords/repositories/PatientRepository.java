package com.pharma.patientrecords.repositories;

import com.pharma.patientrecords.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    ArrayList<Patient>  findTop5ByFirstNameContainsOrLastNameContains(String firstname, String lastname);
}

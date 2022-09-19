package com.mindtree.orchard.hospital.repository;

import com.mindtree.orchard.hospital.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends CrudRepository<Patient,Integer> {

	

}

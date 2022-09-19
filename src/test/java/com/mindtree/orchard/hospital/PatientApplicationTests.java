package com.mindtree.orchard.hospital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.hospital.entity.Doctor;
import com.mindtree.orchard.hospital.entity.Patient;
import com.mindtree.orchard.hospital.repository.DoctorRepository;
import com.mindtree.orchard.hospital.repository.PatientRepository;

@SpringBootTest
public class PatientApplicationTests {
			
		@Autowired
		private PatientRepository patientRepo;

		@Test
		 void testAdd() {
			Patient pat=new Patient();
				pat.setId(1);
				pat.setName("Pritam");
				pat.setDoctor_name("Nitin");
				pat.setDate_of_visit("24/4/2022");
				pat.setPrescription("Omez");
		
		patientRepo=save(pat);}
		
	private PatientRepository save(Patient pat) {
			// TODO Auto-generated method stub
			return null;
		}

private void assertNotNull(Patient patient) {
			// TODO Auto-generated method stub
			
		}
	public void getPatientByIdTest() {
		Patient patient=patientRepo.findById(1).get();
	assertEquals("Pritam",patient.getName());
	}

private void assertEquals(String string, String name) {
	// TODO Auto-generated method stub
	
}

private void assertEquals(int i, int age) {
		// TODO Auto-generated method stub
		
	}}
			
	
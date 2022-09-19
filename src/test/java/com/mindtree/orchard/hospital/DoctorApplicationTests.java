package com.mindtree.orchard.hospital;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.hospital.entity.Doctor;
import com.mindtree.orchard.hospital.repository.DoctorRepository;

@SpringBootTest
public class DoctorApplicationTests {
	
	
	private DoctorRepository doctorRepo;

	@Test
	 void testAdd() {
		Doctor dc=new Doctor();
			dc.setId(1);
	dc.setName("Nitin");
	dc.setAge(38);
	dc.setField("BAMS");
	dc.setGender("male");
	doctorRepo=save(dc);
	}
	private DoctorRepository save(Doctor dc) {
		// TODO Auto-generated method stub
		return null;
	}


private void assertNotNull(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

public void getDoctorByIdTest() {
	Doctor doctor=doctorRepo.findById(1).get();
assertEquals(38,doctor.getAge());
}



private void assertEquals(int i, int age) {
	// TODO Auto-generated method stub
	
}}
		
	
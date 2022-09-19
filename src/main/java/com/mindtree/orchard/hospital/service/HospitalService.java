package com.mindtree.orchard.hospital.service;

import java.util.List;

import com.mindtree.orchard.hospital.entity.Doctor;
import com.mindtree.orchard.hospital.entity.Patient;


public interface HospitalService {

    public Doctor showDoctorInformation(String name);
    public Patient showPatientInformation(int Id);
    public boolean saveDoctorInformation(Doctor doctor);
    public boolean savePatientInformation(Patient patient);
    public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
    public List<Doctor> getDoctors();

}


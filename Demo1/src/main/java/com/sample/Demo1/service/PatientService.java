package com.sample.Demo1.service;

import com.sample.Demo1.entity.Patient;
import com.sample.Demo1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public void addPatient(Patient patient)
    {
        patientRepository.save(patient);
    }
    public List<Patient> getAllPatientDetails()
    {
        return patientRepository.findAll(Sort.by(Sort.Direction.DESC,"pid"));
    }
    public Patient editPatientDetails(Patient patient)
    {
        return  patientRepository.save(patient);
    }
    public void deletePatientsDetails(Patient patient) {
        patientRepository.delete(patient);
    }

    public void  deletePatientDetailsById(Integer did)
    {
        patientRepository.deleteById(did);
    }
    public long countPatientDetails()
    {
        return patientRepository.count();
    }
    public Patient getPatientDetails(Integer pid)
    {
        return  patientRepository.getById(pid);
    }

}

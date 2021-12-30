package com.sample.Demo1.service;

import com.sample.Demo1.entity.Bill;
import com.sample.Demo1.entity.Out_patient;
import com.sample.Demo1.repository.Out_patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Out_PatientService {

    @Autowired
    private Out_patientRepository out_patientRepository;


    public void addOutPatient(Out_patient out_patient)
    {
        out_patientRepository.save(out_patient);
    }
    public List<Out_patient> getAllOutPatientDetails()
    {
        return out_patientRepository.findAll(Sort.by(Sort.Direction.DESC,"pid"));
    }
    public Out_patient editOutPatientDetails(Out_patient out_patient)
    {
        return  out_patientRepository.save(out_patient);
    }
    public void deleteOutPatientDetails(Out_patient out_patient) {
        out_patientRepository.delete(out_patient);
    }

    public void  deleteOutPatientDetailsById(Integer pid)
    {
        out_patientRepository.deleteById(pid);
    }
    public long countOutPatientDetails()
    {
        return out_patientRepository.count();
    }
    public Out_patient getOutPatientDetails(Integer pid)
    {
        return  out_patientRepository.getById(pid);
    }


}

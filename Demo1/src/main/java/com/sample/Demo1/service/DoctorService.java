package com.sample.Demo1.service;

import com.sample.Demo1.entity.Doctor;
import com.sample.Demo1.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public void addDoctor(Doctor doctor)
    {
        doctorRepository.save(doctor);
    }
    public List<Doctor> getAllDoctorDetails()
    {
        return doctorRepository.findAll(Sort.by(Sort.Direction.DESC,"did"));
    }
    public Doctor editDoctorDetails(Doctor doctor)
    {
        return  doctorRepository.save(doctor);
    }
    public void deleteDoctorDetails(Doctor doctor) {
        doctorRepository.delete(doctor);
    }

    public void  deleteDoctorDetailsById(Integer did)
    {
        doctorRepository.deleteById(did);
    }
    public long countDoctorDetails()
    {
        return doctorRepository.count();
    }
    public Doctor getDoctorDetails(Integer did)
    {
        return  doctorRepository.getById(did);
    }

}

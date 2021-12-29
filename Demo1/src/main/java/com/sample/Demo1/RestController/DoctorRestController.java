package com.sample.Demo1.RestController;

import com.sample.Demo1.entity.Doctor;
import com.sample.Demo1.entity.Patient;
import com.sample.Demo1.exception.InternalServerErrorException;
import com.sample.Demo1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Doctor")
public class DoctorRestController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping( method = RequestMethod.POST, headers = "Accept=application/json")
    public Doctor addDoctor(@RequestBody Doctor doctor) throws InternalServerErrorException
    {
        doctorService.addDoctor(doctor);
        return doctor;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Doctor updateDoctor(@RequestBody Doctor doctor) throws InternalServerErrorException
    {
        doctorService.editDoctorDetails(doctor);
        return doctor;
    }
    @GetMapping("/get/{did}")
    public Doctor getDoctorDetails(@PathVariable("did") String did) throws InternalServerErrorException
    {
           Doctor doctor =doctorService.getDoctorDetails(Integer.parseInt(did));
           return doctor;
    }
    @GetMapping("/get")
    public List<Doctor> getAllDoctorDetails() throws InternalServerErrorException
    {
        List<Doctor> list = doctorService.getAllDoctorDetails();
        return list;
    }
    @DeleteMapping("/delete")
    public void deleteDoctorDetails(Doctor doctor) throws InternalServerErrorException
    {
        doctorService.deleteDoctorDetails(doctor);
    }

    @DeleteMapping("/delete/{did}")
    public Doctor deleteById(@PathVariable("did") String did) throws InternalServerErrorException
    {
        doctorService.deleteDoctorDetailsById(Integer.parseInt(did));
        Doctor d = new Doctor();
        return d;
    }

}

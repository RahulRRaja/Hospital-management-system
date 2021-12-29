package com.sample.Demo1.RestController;

import com.sample.Demo1.entity.Patient;
import com.sample.Demo1.exception.InternalServerErrorException;
import com.sample.Demo1.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientRestController {

    @Autowired
    private PatientService patientService;

    @RequestMapping( method = RequestMethod.POST, headers = "Accept=application/json")
    public Patient addPatient(@RequestBody Patient patient) throws InternalServerErrorException
    {
        patientService.addPatient(patient);
        return patient;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Patient updatePatient(@RequestBody Patient patient) throws InternalServerErrorException
    {
        patientService.editPatientDetails(patient);
        return patient;
    }
    @GetMapping("/get/{pid}")
    public Patient getPatientDetails(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
        Patient patient = patientService.getPatientDetails(Integer.parseInt(pid));
        return patient;
    }
    @GetMapping("/get")
    public List<Patient> getAllPatientDetails() throws InternalServerErrorException
    {
        List<Patient> list = patientService.getAllPatientDetails();
        return list;
    }
    @DeleteMapping("/delete")
    public void deletePatientDetails(Patient patient) throws InternalServerErrorException
    {
        patientService.deletePatientsDetails(patient);
    }

    @DeleteMapping("/delete/{pid}")
    public Patient deleteById(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
        patientService.deletePatientDetailsById(Integer.parseInt(pid));
        Patient d = new Patient();
        return d;
    }
}

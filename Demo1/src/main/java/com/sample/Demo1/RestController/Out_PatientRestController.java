package com.sample.Demo1.RestController;

import com.sample.Demo1.entity.Out_patient;
import com.sample.Demo1.entity.Patient;
import com.sample.Demo1.exception.InternalServerErrorException;
import com.sample.Demo1.service.Out_PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class Out_PatientRestController {

    @Autowired
    private Out_PatientService out_patientService;

    @RequestMapping( method = RequestMethod.POST, headers = "Accept=application/json")
    public Out_patient addOutPatient(@RequestBody Out_patient out_patient) throws InternalServerErrorException
    {
        out_patientService.addOutPatient(out_patient);
        return out_patient;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Out_patient updateOutPatient(@RequestBody Out_patient out_patient) throws InternalServerErrorException
    {
      out_patientService.editOutPatientDetails(out_patient);
        return out_patient;
    }
    @GetMapping("/get/{pid}")
    public Out_patient getOutPatientDetails(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
       Out_patient out_patient = out_patientService.getOutPatientDetails(Integer.parseInt(pid));
        return out_patient;
    }
    @GetMapping("/get")
    public List<Out_patient> getAllOutPatientDetails() throws InternalServerErrorException
    {
        List<Out_patient> list = out_patientService.getAllOutPatientDetails();
        return list;
    }
    @DeleteMapping("/delete")
    public void deleteOutPatientDetails(Out_patient out_patient) throws InternalServerErrorException
    {
        out_patientService.deleteOutPatientDetails(out_patient);
    }

    @DeleteMapping("/delete/{pid}")
    public Out_patient deleteById(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
        out_patientService.deleteOutPatientDetailsById(Integer.parseInt(pid));
        Out_patient o = new Out_patient();
        return o;
    }

}

package com.sample.Demo1.RestController;

import com.sample.Demo1.entity.Lab_report;
import com.sample.Demo1.entity.Patient;
import com.sample.Demo1.exception.InternalServerErrorException;
import com.sample.Demo1.service.LabReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/LabReport")
public class LabReportRestController {
    @Autowired
    private LabReportService labReportService;

    @RequestMapping( method = RequestMethod.POST, headers = "Accept=application/json")
    public Lab_report addLabReport(@RequestBody Lab_report lab_report) throws InternalServerErrorException
    {
        labReportService.addLabReport(lab_report);
        return lab_report;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Lab_report updateLabReport(@RequestBody Lab_report lab_report) throws InternalServerErrorException
    {
        labReportService.editLabReportDetails(lab_report);
        return lab_report;
    }
    @GetMapping("/get/{lab_no}")
    public Lab_report getLabReportDetails(@PathVariable("lab_no") String lab_no) throws InternalServerErrorException
    {
        Lab_report lab_report = labReportService.getLabReportDetails(Integer.parseInt(lab_no));
        return lab_report;
    }
    @GetMapping("/get")
    public List<Lab_report> getLabReportDetails() throws InternalServerErrorException
    {
        List<Lab_report> list = labReportService.getAllLabReportDetails();
        return list;
    }
    @DeleteMapping("/delete")
    public void deleteLabReportDetails(Lab_report lab_report) throws InternalServerErrorException
    {
        labReportService.deleteLabReportDetails(lab_report);
    }

    @DeleteMapping("/delete/{lab_no}")
    public Lab_report deleteById(@PathVariable("lab_no") String lab_no) throws InternalServerErrorException
    {
        labReportService.deleteLabReportDetailsById(Integer.parseInt(lab_no));
        Lab_report l = new Lab_report();
        return l;
    }


}

package com.sample.Demo1.service;

import com.sample.Demo1.entity.Lab_report;
import com.sample.Demo1.repository.Lab_reportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabReportService
{
    @Autowired
    private Lab_reportRepository lab_reportRepository;

    public void addLabReport(Lab_report lab_report)
    {
        lab_reportRepository.save(lab_report);
    }
    public List<Lab_report> getAllLabReportDetails()
    {
        return lab_reportRepository.findAll(Sort.by(Sort.Direction.DESC,"lab_no"));
    }
    public Lab_report editLabReportDetails(Lab_report lab_report)
    {
        return lab_reportRepository.save(lab_report);
    }
    public void deleteLabReportDetails(Lab_report lab_report) {
        lab_reportRepository.delete(lab_report);
    }

    public void  deleteLabReportDetailsById(Integer lab_no)
    {
        lab_reportRepository.deleteById(lab_no);
    }
    public long countLabReportDetails()
    {
        return lab_reportRepository.count();
    }
    public Lab_report getLabReportDetails(Integer lab_no)
    {
        return  lab_reportRepository.getById(lab_no);
    }
}

package com.sample.Demo1.service;

import com.sample.Demo1.entity.Bill;
import com.sample.Demo1.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public void addBill(Bill bill)
    {
        billRepository.save(bill);
    }
    public List<Bill> getAllBillDetails()
    {
        return billRepository.findAll(Sort.by(Sort.Direction.DESC,"bill_no"));
    }
    public Bill editBillDetails(Bill bill)
    {
        return  billRepository.save(bill);
    }
    public void deleteBillDetails(Bill bill) {
        billRepository.delete(bill);
    }

    public void  deleteBillDetailsById(Integer bill_no)
    {
        billRepository.deleteById(bill_no);
    }
    public long countBillDetails()
    {
        return billRepository.count();
    }
    public Bill getBillDetails(Integer bill_no)
    {
        return  billRepository.getById(bill_no);
    }


}

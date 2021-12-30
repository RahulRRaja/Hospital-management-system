package com.sample.Demo1.RestController;

import com.sample.Demo1.entity.Bill;
import com.sample.Demo1.exception.InternalServerErrorException;
import com.sample.Demo1.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillRestController {

    @Autowired
    private BillService billService;

    @RequestMapping( method = RequestMethod.POST, headers = "Accept=application/json")
    public Bill addBill(@RequestBody Bill bill) throws InternalServerErrorException
    {
        billService.addBill(bill);
        return bill;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Bill updateBill(@RequestBody Bill bill) throws InternalServerErrorException
    {
        billService.editBillDetails(bill);
        return bill;
    }
    @GetMapping("/get/{pid}")
    public Bill getBillDetails(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
        Bill bill= billService.getBillDetails(Integer.parseInt(pid));
        return bill;
    }
    @GetMapping("/get")
    public List<Bill> getAllBillDetails() throws InternalServerErrorException
    {
        List<Bill> list = billService.getAllBillDetails();
        return list;
    }
    @DeleteMapping("/delete")
    public void deleteBillDetails(Bill bill) throws InternalServerErrorException
    {
        billService.deleteBillDetails(bill);
    }

    @DeleteMapping("/delete/{pid}")
    public Bill deleteById(@PathVariable("pid") String pid) throws InternalServerErrorException
    {
        billService.deleteBillDetailsById(Integer.parseInt(pid));
        Bill b = new Bill();
        return b;
    }

}

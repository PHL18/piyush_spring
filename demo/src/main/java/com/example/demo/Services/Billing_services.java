package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Billing_Repository;

import com.example.demo.model.Billing;


@Service
public class Billing_services {
    @Autowired
    Billing_Repository billing_Repository;

  

   

    public double calculateBill(int units)
    {
        double bill=0;
        if(units<=50)
        {
            bill=units*3.50;
        }
        else if(units<=150)
        {
            bill=(50*40)+((units-100)*4);

        }
        else if(units<=250)
        {
            bill=(50*3.5)+(100*4)+((units-150)*5.2);
        }
        else
        {
            bill=(50*3.5)+(100*4)+(150*5.2)+((units-250)*6.5);
        }
        return bill;
    }

    public Billing CreateBill(Billing bill)
    {
        double total_amount=calculateBill(bill.getUnits_consumed());
        bill.setTotal_bill(total_amount);
        return billing_Repository.save(bill);
    }
    public List<Billing> getAllBlls()
    {
        return billing_Repository.findAll();
    }
    public Billing getBillByid(int id)
    {
        Billing billing=new Billing();
        billing.setId(0);
        billing.setTotal_bill(0);
        return billing_Repository.findById(id).orElse(billing);
    }

}

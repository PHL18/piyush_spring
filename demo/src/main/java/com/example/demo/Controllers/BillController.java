package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.Billing_services;
import com.example.demo.Services.Consumer_services;
import com.example.demo.model.Billing;
import com.example.demo.model.Consumer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class BillController {

    @Autowired
    Billing_services billing_services;

    @Autowired
    Consumer_services consumer_services;

    


    @PostMapping("/addconsumer")
    public void addCustomer(@RequestBody Consumer consumer)
    {
        consumer_services.addConsumer(consumer);
    }
    @GetMapping("/getallconsumers")
    public List <Consumer> getAllConsumers()
    {
        return consumer_services.getAllConsumer();
    }
    @GetMapping("/consumer/{id}")
    public Consumer getConsumerById(@PathVariable int id)
    {
        return consumer_services.findConsumerbyId(id);
    }
    @GetMapping("/getallbills")
    public List <Billing> getAllBills()
    {
        return billing_services.getAllBlls();
    }
    public Billing getBillbyId(@PathVariable int id)
    {
        return billing_services.getBillByid(id);
    }
    @PostMapping("/calculatebill")
    public Billing addbill(@RequestBody Billing bill)
    {
        return billing_services.CreateBill(bill);

    }
    

  
    
    
    

}

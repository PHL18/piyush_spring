package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Consumer_Repository;
import com.example.demo.model.Consumer;

@Service
public class Consumer_services {
    @Autowired
    Consumer_Repository consumer_Repository;

    public void addConsumer(Consumer consumer)
    {
        consumer_Repository.save(consumer);
    }
    public List<Consumer>getAllConsumer()
    {
        return consumer_Repository.findAll();

    }
    public Consumer findConsumerbyId(int id)
    {
        Consumer consumer=new Consumer();
        consumer.setId(0);
        consumer.setName("unknown");
        consumer.setUnits_comsumed(0);
        return consumer_Repository.findById(id).orElse(consumer);
    }

}

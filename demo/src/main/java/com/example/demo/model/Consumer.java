package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Consumer {
    @Id
    private int id;
    private String name;
    private int units_comsumed;


    
    public Consumer(int id, String name, int units_comsumed) {
        this.id = id;
        this.name = name;
        this.units_comsumed = units_comsumed;
      
    }
    public Consumer() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getUnits_comsumed() {
        return units_comsumed;
    }
    public void setUnits_comsumed(int units_comsumed) {
        this.units_comsumed = units_comsumed;
    }
  
   
    
}

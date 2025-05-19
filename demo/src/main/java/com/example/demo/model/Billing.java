package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Billing {
    @Id
    private int id;
    private double total_bill;
    private int units_consumed;

    
    public int getUnits_consumed() {
        return units_consumed;
    }
    public void setUnits_consumed(int units_consumed) {
        this.units_consumed = units_consumed;
    }
    public Billing(int id, double total_bill,int units_consumed) {
        this.id = id;
        this.total_bill = total_bill;
        this.units_consumed=units_consumed;

    }
    public Billing() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getTotal_bill() {
        return total_bill;
    }
    public void setTotal_bill(double total_bill) {
        this.total_bill = total_bill;
    }
    
}

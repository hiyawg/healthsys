package com.HospitalMangagmentSystem.demo.domain;

import javax.persistence.*;

@Entity
@Table(name="lab_price")
@NamedQuery(name="LabPrice.findAll", query="SELECT l FROM LabPrice l")
public class LabPrice {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Double price;
    private boolean finished;


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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}

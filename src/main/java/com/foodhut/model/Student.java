package com.foodhut.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

    //predefine validator
    @NotNull(message = "Name can't be empty")
    @Size(min = 3 , message = "Name should be valid")
    private String name;

    @NotNull(message = "Roll can't be empty")
    @Size(min = 2, message = "Roll should be right form")
    private int roll;

    //custom validator
    private String address;


    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    
}

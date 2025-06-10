package com.foodhut.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {

    @NotNull(message = "Name can't be empty")
    @Size(min = 1, message = "Name should be at least 3 characters")
    private String name;

    @NotNull(message = "Roll can't be empty")
    @Min(value = 10, message = "roll number must be two digit")
    private Integer roll; // Changed to Integer to handle validation properly

    // Custom validator would be added via annotation
    private String address;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
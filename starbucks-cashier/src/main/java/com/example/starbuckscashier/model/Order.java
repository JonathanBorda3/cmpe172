package com.example.starbuckscashier.model;

import lombok.Data;

@Data
public class Order {
    private String drink;
    private String milk;
    private String size;
    private double total;
    private String status;
    private String register;
}

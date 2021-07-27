package com.example.interviewproject.model;

public class RegularOffer {

    public Long id;
    public Integer quantity;
    public Integer price;

    public RegularOffer(Long id, int quantity, int price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

package com.kay.espresso.model;

public class Order {

    private Long id;
    private String coffeeName;
    private Double price;
    private OrderStatus status;

    public Order() {
    }

    public Order(Long id, String coffeeName, Double price, OrderStatus status) {
        this.id = id;
        this.coffeeName = coffeeName;
        this.price = price;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public Double getPrice() {
        return price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

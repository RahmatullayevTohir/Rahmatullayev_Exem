package com.example.rahmatullayev_exem.user;

public class User {
    private String Restaurant;
    private double price;
    private int rating;
    private int profile;

    public User(String restaurant, double price, int rating, int profile) {
        Restaurant = restaurant;
        this.price = price;

    }

    public User() {
    }

    public String getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(String restaurant) {
        Restaurant = restaurant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

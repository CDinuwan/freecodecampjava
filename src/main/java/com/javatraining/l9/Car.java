package com.javatraining.l9;

public class Car {

    private String owner;
    private String manufacturer;
    private String color;

    public Car(String owner, String manufacturer, String color) {
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        return false;
    }
}

package com.javatraining.l5;

public class BMW implements Car, Loggable {

    public void drive() {
        System.out.println("Start driving a BMW Car");
    }

    @Override
    public void drive(Car car) {

    }

    @Override
    public void message() {
        System.out.println("Loggable BMW Car");
    }
}

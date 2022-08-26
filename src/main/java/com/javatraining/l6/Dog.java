package com.javatraining.l6;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating... ");
    }

    public void age(String a) {
        System.out.println("Method Overloading");;
    }

    public void walk() {
    }
}

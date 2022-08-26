package com.javatraining.l5;

import com.javatraining.l2.Name;

import java.awt.*;

public class BMW implements Car, Loggable {

    private Name ownersName;
    private Color color;

    public void drive() {
        System.out.println("Start driving a BMW Car");
    }

//    public BMW(BMW bmw){
//        this.ownersName = new Name(bmw.ownersName);
//        this.color = new Color(bmw.color);
//    }

//    public static BMW newInstance(BMW bmw) {
//        return new BMW(Name.newInstance(bmw.ownersName),Color.newInstance(bmw.color));
//    }

    @Override
    public void drive(Car car) {

    }

    @Override
    public void message() {
        System.out.println("Loggable BMW Car");
    }
}

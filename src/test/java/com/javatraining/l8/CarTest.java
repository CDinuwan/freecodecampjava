package com.javatraining.l8;

import com.javatraining.l5.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void primitivesShouldBeEqual() {
        int i = 4;
        int j = 4;
        assertTrue(i == j);
    }

    @Test
    public void stringShouldBeEqual() {
        String hello1 = "Hello";
        String hello2 = "Hello";
        String hello3 = "H";

        assertTrue(hello2 == hello1);

        hello3 = hello3 + "ello";
        System.out.println(hello3);
        assertTrue(hello1.equals(hello3));
    }

    @Test
    public void porscheShouldBeEqual() {
        Car myPorsche1 = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive");
            }

            @Override
            public void drive(Car car) {

            }
        };

        Car myPorsche2 = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive Through");
            }

            @Override
            public void drive(Car car) {

            }
        };

//        myPorsche2 = myPorsche1;
        assertTrue(myPorsche1.equals(myPorsche2));

    }
}

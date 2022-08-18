package com.javatraining.l1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person marcus = new Person();
        assertEquals("Hello World!", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloName() {
        Person person = new Person();
        assertEquals("Hello Name", person.hello("Name"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
        }

        assertEquals(5, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        boolean monday = false;
        boolean raining = true;
        boolean areEqual = monday != raining;

        if (isItMonday() && isItRaining()) {
            drinkBeer();
        } else if (isItMonday() || isItRaining()) {
            drinkWater();
        } else {
            drinkMilk();
        }
    }

    @Test
    public void demonstrateBooleanWithInt() {
        int i = 5;
        int j = 7;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter Your Number Here: ");
//        int j = scanner.nextInt();

        if (i == j) {
            j = 10;
        } else if (i == j) {
            i = 8;
        } else {
            j++;
        }
    }

    private void drinkMilk() {
    }

    private void drinkWater() {
    }

    private void drinkBeer() {
    }

    private boolean isItRaining() {
        return true;
    }

    private boolean isItMonday() {
        return true;
    }
}

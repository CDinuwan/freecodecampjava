package com.javatraining.l1;

import com.javatraining.l2.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person() {
        personCounter++;
        /*
        empty on purpose --> default constructor
         */

        //single line comment
    }

    public Person(Name personName) {
        this.personName = personName;
    }

    public String helloWorld() {
        return "Hello World!";
    }

    public Name returnName() {
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}

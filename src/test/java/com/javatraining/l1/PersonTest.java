package com.javatraining.l1;

import com.javatraining.l3.LoggingLevel;
import com.javatraining.l3.LoggingLevelObject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private final static String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};
    private final static int PROCESSED = 42;
    private final static int PROCESSING = 32;
    private final static int PENDING = 40;

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

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

        int j = 0;
        while (j < 4) {
            Person person = new Person();
            j++;
        }

        do {
            assertEquals(j, Person.numberOfPersons());
            j++;
        } while (j < 4);

        assertEquals(4, Person.numberOfPersons());

        for (int i = 0; i < 5; i++) {
            Person person = new Person();
        }

        assertEquals(9, Person.numberOfPersons());
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

    @Test
    public void demonstrateArray() {
        Person[] persons = new Person[10];
        Person myPerson = new Person();
        int[] myInts = new int[9];

        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[1] = persons[3];
        persons[2] = myPerson;

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].helloWorld();
        }

        Person[] persons2 = {null, new Person(), persons[0], persons[2], persons[2]};

        persons[0] = null;
    }

    @Test
    public void demonstrateForeEach() {
        Person[] persons = new Person[10];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        for (Person person : persons) {
            person.helloWorld();
        }
    }

    @Test
    public void demonstrateEnum() {
        System.out.println(MY_STATE_VALUES.length);
        LoggingLevel states = LoggingLevel.PENDING;
        for (LoggingLevel state : LoggingLevel.values()) {
            if (state.equals(LoggingLevel.PENDING)) {
                System.out.println(state);
            }
            LoggingLevelObject status = LoggingLevelObject.PENDING;
            System.out.println(state);
        }

        LoggingLevelObject statuss = LoggingLevelObject.PROCESSED;
        if (statuss.isPending()) {
            System.out.println(LoggingLevelObject.PENDING);
        }
    }

    @Test
    public void demonstrateSwitchStatement() {

        LoggingLevel state = LoggingLevel.PROCESSING;

        switch (state) {
            case PENDING:
                System.out.println("Pending");
                break;
            case PROCESSING:
                System.out.println("Processing");
                break;
            default:
                System.out.println("Invalid");
                //Throw error is good in here
                break;
        }

        int myState = 43;
        switch (myState) {
            case PENDING:
                System.out.println(PENDING);
                break;
            case PROCESSING:
                System.out.println(PROCESSING);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

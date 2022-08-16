package com.javatraining.l1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person marcus = new Person();
        assertEquals("Hello World!", marcus.helloWorld());
    }
}

package com.javatraining.l5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray() {
        String[] array = {"One", "Two", "Three"};
        String[] copiedArray = array.clone();
        assertSame(array, array);
        assertNotSame(array, copiedArray);

        for (String str : copiedArray) {
            System.out.println(str);
        }
        System.out.println(copiedArray[0]);
    }

    @Test
    public void shouldClonePorsche() throws CloneNotSupportedException {
//        Porche porsche = new Porche("Marcus", ownerName);
//        Porche petersPorsche = porsche.clone();
//        assertNotSame(petersPorsche, porsche);
//        petersPorsche.asString();
//
//        assertEquals("Porsche of Peter", petersPorsche.asString());
//        assertEquals("Porsche of Marcus", porsche.toString());
    }
}

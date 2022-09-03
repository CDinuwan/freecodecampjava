package com.javatraining.l11;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListPractise {

    public static void main(String[] args) {
        Collection<String> elements = new ArrayList<>(5);
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());
        elements.add("A");
        elements.add("B");
        elements.add("C");
        elements.add("E");
        elements.add("C");
        elements.add("E");
        elements.add("C");
        elements.add("E");

        elements.remove("A");
        System.out.println(elements.size());
        System.out.println(elements.getClass());

        for (String str : elements) {
            System.out.println(str);
        }
    }
}

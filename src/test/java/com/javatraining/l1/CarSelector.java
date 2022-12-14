package com.javatraining.l1;

import com.javatraining.l4.CarService;
import com.javatraining.l4.CarState;
import sun.plugin.dom.exception.InvalidStateException;

public class CarSelector {

    public static void main(String[] args) {
        CarService carService = new CarService();
        for (String argument : args) {
            if (isValid(argument)) {
                carService.process(argument);
            } else {
                System.err.println("Ignoring invalid argument: " + argument);
            }
        }
    }

    private static boolean isValid(String argument) {
        try {
            CarState.valueOf(argument);
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }
        return true;
    }
}

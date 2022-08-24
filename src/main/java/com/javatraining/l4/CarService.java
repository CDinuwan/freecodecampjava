package com.javatraining.l4;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger LOG = LoggerFactory.getLogger(CarService.class);

    public static void main(String[] args) {

        CarService carService = new CarService();
        for (String argument : args) {
            carService.process(argument);
        }
    }

    public void process(String input) {

        LOG.info("Processing");

        if (LOG.isDebugEnabled()) {
            LOG.debug("Processing car: {}", input);
        }
    }

    public void processHappening(String input) {
        CarState carState = CarState.from(input);
        System.out.println("valid state: " + carState);
    }
}

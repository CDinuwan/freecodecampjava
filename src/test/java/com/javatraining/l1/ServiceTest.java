package com.javatraining.l1;

import com.javatraining.l4.CarService;
import com.javatraining.l4.CarState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ServiceTest {

    @Test
    public void process() {
        CarService carService = new CarService();
        carService.process("BMW");

        String[] arguments = {"MINI", "AUDI"};
        CarService.main(arguments);

        new CarService().process("TOYOTA");
    }

    @Test
    public void processCarService() throws Exception {
        String input = "Hello";
        try {
            CarState carState = CarState.from(input);
        } catch (RuntimeException e) {
            IOException er = new IOException("my IOException");
            throw new RuntimeException(er);
        } finally {
            System.out.println("This is finally");
        }
    }
}

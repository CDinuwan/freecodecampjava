package com.javatraining.l2;

import com.javatraining.l5.BMW;
import com.javatraining.l5.Car;
import com.javatraining.l5.Porche;
import org.junit.jupiter.api.Test;

public class InterfaceTest {

    @Test
    public void shouldDemonstrateInterfaces() {

        Car[] cars = {new BMW(), new Porche()};

        for (Car car : cars) {
            car.drive();
        }

            Porche porche = new Porche();
        porche.drive();

        InterfaceTest interfaceTest = new InterfaceTest();
        Car car;
        boolean sunny = true;
        if(sunny) {
            car = new Porche();
        } else {
            car = new BMW();
        }
        car.drive();
        car.drive(car);
    }
}

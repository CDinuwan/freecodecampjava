package com.javatraining.l10;

public class Car {

    private Engine engine;
    private Vin vehicleIdentificationNumber;
    private Manufacturer manufacturer;
    private Color color;
    private int numberOfWheels;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return true;
        }
        Car other = (Car) obj;
        if (!manufacturer.equals(other.manufacturer)) {
            return false;
        }
        if (!engine.equals(other.engine)) {
            return false;
        }
        if (!color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + engine.hashCode();
        return 31 * result + color.hashCode();
    }
}

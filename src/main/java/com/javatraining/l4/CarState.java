package com.javatraining.l4;

import com.sun.javaws.exceptions.InvalidArgumentException;

public enum CarState {

    DRIVING, WAITING, PARKING, NEW_STATE;

    public static CarState from(String state) {
        switch (state) {
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new RuntimeException("Unknown state: " + state);
        }
    }
}

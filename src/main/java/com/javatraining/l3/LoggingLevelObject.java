package com.javatraining.l3;

public enum LoggingLevelObject {

    PENDING(1), PROCESSING(2), PROCESSED(3);

    private int i;

    private LoggingLevelObject(int i) {
        this.i = i;
    }

    public int code() {
        return i;
    }

    public boolean isPending() {
        return this == PENDING;
    }
}

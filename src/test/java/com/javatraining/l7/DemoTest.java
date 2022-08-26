package com.javatraining.l7;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {

    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private Object myObject;

    private boolean myBoolean;
    private char myChar;

    @Test
    public void shouldDemonstrateStaticImport() {
        assertTrue(true);
    }

    @Test
    public void shouldDemonstrateDataTypeDefaultValues() {
        System.out.println("byte default value: " + myByte);
        System.out.println("short default value: " + myShort);
        System.out.println("int default value: " + myInt);
        System.out.println("long default value: " + myLong);
        System.out.println("double default value: " + myDouble);
        System.out.println("object default value: " + myObject);
        System.out.println("boolean default value: " + myBoolean);
        System.out.println("char default value: " + myChar);
        System.out.println("char default value as int: " + (int) myChar);
    }

    @Test
    public void shouldDemonstrateNumberObject() {
        float myFloat = 43.29F;
        short s = 43;
        long l = 43;
        Byte b = Byte.valueOf(myByte);
        b.byteValue();
        boolean bTest = Boolean.TRUE;

        Byte aByte = Byte.parseByte("2");
    }

    @Test
    public void shouldDemonstrateRanges() {
        System.out.println("Byte: " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println("Float" + Float.MIN_VALUE + " " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " " + Double.MAX_VALUE);
        System.out.println("Character: " + (int) Character.MIN_VALUE + " " + (int) Character.MAX_VALUE);
    }

    @Test
    public void shouldDemonstrateBase2() {
        byte binary1 = 0B0;
        short binary2 = 0b1;
        int binary3 = 0b0100101_0101_0101_1100_0000;
        System.out.println(binary1);
        System.out.println(binary2);
        System.out.println(binary3);
    }

    @Test
    public void shouldDemonstrateBase8() {
        byte octal1 = 07;
        short octal2 = 010;
        long octal3 = 017653100________476L;
        System.out.println(octal1);
        System.out.println(octal2);
        System.out.println(octal3);
    }

    @Test
    public void shouldDemonstrateBase16() {
        byte hex1 = 0x0;
        short hex2 = 0xF;
        long hex3 = 0x39__e49Fa__BCD10L;
        System.out.println(hex3);
        System.out.println(hex2);
        System.out.println(hex1);
    }
}

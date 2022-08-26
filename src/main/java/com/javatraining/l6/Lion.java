package com.javatraining.l6;

import com.javatraining.l5.Loggable;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Lion extends Animal implements Loggable, Printable {


    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }

    @Override
    public void message() {
        System.out.println("Something... ");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating... ");
    }
}

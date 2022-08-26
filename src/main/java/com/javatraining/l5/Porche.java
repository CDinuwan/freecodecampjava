package com.javatraining.l5;

public class Porche implements Car {

    private String owner;
    private final Name ownerName;

    public Porche(String owner, Name ownerName) {
        this.owner = owner;
        this.ownerName = ownerName;
    }

    IOReader ioReader = new IOReader();

    public void drive() {
        System.out.println("Start driving a Porsche Car");
    }

    @Override
    public void drive(Car car) {

    }

    public void close() {
        // Clean up IO Resources
    }

    public void SellTo(Name newOwner) {
//        this.ownerName.alterColor(newColor.name());
    }

    @Override
    protected void finalize() {

    }

//    @Override
//    public Porche clone() throws CloneNotSupportedException {
//        return (Porche) super.clone();
//    }

    @Override
    public Porche clone() {
        try {
            return (Porche) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String asString() {
        return "Porsche of" + owner;
    }
}

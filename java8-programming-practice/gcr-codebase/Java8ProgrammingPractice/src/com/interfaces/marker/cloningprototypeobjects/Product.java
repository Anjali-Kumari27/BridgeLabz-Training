package com.interfaces.marker.cloningprototypeobjects;


public class Product implements Prototype, Cloneable {

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Object getClone() {
        try {
            return this.clone();   // allowed because Cloneable
        } catch (CloneNotSupportedException e) {
            System.out.println("Product cloning not supported");
            return null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}


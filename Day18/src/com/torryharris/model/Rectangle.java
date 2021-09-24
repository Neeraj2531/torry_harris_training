package com.torryharris.model;

public class Rectangle extends Shape{
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
        setNoOfSides(4);
    }
    public void area(){
        System.out.println("Area of rectangle "+length*height);
    }
}

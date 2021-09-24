package com.torryharris.model;

public class Peacock implements Bird{
    @Override
    public void fly() {
        System.out.println("Peacock do not fly higher");
    }

    @Override
    public void eat() {
        System.out.println("Peacock eats insects");
    }
}

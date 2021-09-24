package com.torryharris.model;

public class Bat implements Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat is flying at night");

    }

    @Override
    public void feed() {
        System.out.println("Bat feeds its child");

    }

    @Override
    public void eat() {
        System.out.println("Bat also eats insects");

    }
}

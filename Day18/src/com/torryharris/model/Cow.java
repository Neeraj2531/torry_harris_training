package com.torryharris.model;

public class Cow implements Mammal{
    @Override
    public void feed() {
        System.out.println("Cow is carnivorous");

    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass");

    }
}

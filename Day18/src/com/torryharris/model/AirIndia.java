package com.torryharris.model;

public class AirIndia implements Aeroplane{
    @Override
    public void fly() {
        System.out.println("Fly in air");

    }

    @Override
    public void move() {
        System.out.println("Moves very fast");

    }
}

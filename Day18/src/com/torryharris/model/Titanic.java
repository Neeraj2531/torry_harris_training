package com.torryharris.model;

public class Titanic implements Boat{
    @Override
    public void swim() {
        System.out.println("Swims in water");

    }

    @Override
    public void move() {
        System.out.println("Moves in sea");

    }
}

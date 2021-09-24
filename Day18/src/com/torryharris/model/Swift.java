package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Changes gear");

    }

    @Override
    public void move() {
        System.out.println("Moves on road");

    }
}

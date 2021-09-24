package com.torryharris.model;

public class Sedan extends Car{
    int bootSpace;

    public Sedan(String name, String fuelType, int engineCapacity, float power, int noOfGear, Tyre tyre, MusicSystem musicSystem, int bootSpace) {
        super(name, fuelType, engineCapacity, power, noOfGear, tyre, musicSystem);
        this.bootSpace = bootSpace;
    }
    public void displaySedanFeatures(){
     displayFeatures();
        System.out.println("Boot Space= "+bootSpace);
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}

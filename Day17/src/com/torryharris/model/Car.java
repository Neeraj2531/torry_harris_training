package com.torryharris.model;
public class Car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGear;
    private Tyre tyre;
    private MusicSystem musicSystem;

    public Car() {
    }

    public Car(String name, String fuelType, int engineCapacity, float power, int noOfGear, Tyre tyre, MusicSystem musicSystem) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGear = noOfGear;
        this.tyre=tyre;
        this.musicSystem=musicSystem;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getNoOfGear() {
        return noOfGear;
    }

    public void setNoOfGear(int noOfGear) {
        this.noOfGear = noOfGear;
    }
    public void accelerate()
    {
        System.out.println(name+" Car is accelerating");
    }
    public void applyBrake(){
        System.out.println(name+" car is slowing");
    }
    public void changeGear(int gear){
        if(gear<0 || gear>noOfGear)
            System.out.println("Wrong gear selected!!");
        else
        System.out.println(name+" car is changing gear to "+gear);
    }
    public void steer(){
        System.out.println();
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public void displayFeatures(){
        System.out.println("Feature of"+name+"Car");
        System.out.println("Engine capacity "+engineCapacity);
        System.out.println("Power "+power);
        System.out.println("No. of gear "+noOfGear);
        System.out.println("Tyre: name -> "+tyre.getTyreName()+" size -> "+tyre.getSize()+" inches");
        System.out.println("Music System name ->"+ " "+musicSystem.getName()+"No of Speaker-> "+" "+musicSystem.getNoOfSpeakers()
        +"Is subWoofer -> "+" "+musicSystem.isSubWoofer()+"LCD Screen Size-> "+" "+musicSystem.getLCDScreenSize());

    }
}

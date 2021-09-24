package com.torryharris.driver;

import com.torryharris.model.Car;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.Tyre;

public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("MRF",16);
        MusicSystem sony=new MusicSystem("sony",3,false,70);

        Car nexon = new Car("Nexon", "Petrol", 1500, 93.4f, 6,mrf,sony);
        nexon.displayFeatures();
        nexon.accelerate();
        nexon.changeGear(4);
        nexon.steer();
        nexon.applyBrake();


    }
}
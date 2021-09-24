package com.torryharris.driver;

import com.torryharris.model.AirIndia;
import com.torryharris.model.Swift;
import com.torryharris.model.Titanic;

public class VehicleDemo {
    public static void main(String[] args) {
        Swift swift=new Swift();
        swift.changeGear();
        swift.move();
        Titanic titanic=new Titanic();
        titanic.move();
        titanic.swim();
        AirIndia airIndia=new AirIndia();
        airIndia.fly();
        airIndia.move();
    }
}

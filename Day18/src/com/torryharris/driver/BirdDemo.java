package com.torryharris.driver;

import com.torryharris.model.Peacock;
import com.torryharris.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        Peacock peacock=new Peacock();
        peacock.fly();
        peacock.eat();
        Pigeon pigeon=new Pigeon();
        pigeon.fly();
        pigeon.eat();
    }
}

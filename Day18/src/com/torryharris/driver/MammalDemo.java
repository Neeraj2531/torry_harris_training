package com.torryharris.driver;

import com.torryharris.model.Bat;
import com.torryharris.model.Cow;
import com.torryharris.model.Tiger;

public class MammalDemo {
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.feed();
        cow.eat();
        Tiger tiger=new Tiger();
        tiger.eat();
        tiger.feed();
        Bat bat=new Bat();
        bat.eat();
        bat.feed();
        bat.fly();
    }
}

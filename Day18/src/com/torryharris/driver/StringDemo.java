package com.torryharris.driver;
import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        int number=Integer.parseInt(s);
        System.out.println(number*2);
        float f=Float.parseFloat(s);
        System.out.println(f*2);

    }
}

package com.torryharris.driver;
import java.util.*;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        c=sc.nextInt();
        try{
            if(c==0){
                throw new ArithmeticException("Custom Message:Divide by zero error");
            }
            else{
                a=b/c;
            }

        }
        catch(ArithmeticException ex){
            System.out.println("Exception cought");
            System.out.println(ex);
        }
        System.out.println("After if-else statement");

    }
}

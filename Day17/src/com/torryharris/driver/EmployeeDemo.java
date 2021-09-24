package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1=new Employee("Neeraj",5977,"Associate",40000.0f);
        Employee e2=new Employee("sameer",432,"Engineer",30000.0f);


        Manager Suraj=new Manager("Suraj",321,"Manager",100000.2f,
                "IOT",12);
        System.out.println(Suraj);
    }
}

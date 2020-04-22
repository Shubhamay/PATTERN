package com.company.creational.prototype;

public class Employee  implements Prototype{
    public int id;

    public  Employee() {
        id = 1;
    }

    @Override
    public Prototype getClone() {
        return new Employee();
    }
}

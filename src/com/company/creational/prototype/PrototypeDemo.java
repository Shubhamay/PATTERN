package com.company.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1.id);
        Employee e2 = (Employee) e1.getClone();
        System.out.println(e2.id);
    }
}

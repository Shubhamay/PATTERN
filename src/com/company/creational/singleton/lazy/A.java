package com.company.creational.singleton.lazy;

import java.io.Serializable;

public class A implements Serializable {
    private static A obj;
    private A(){}

    public static A getA(){
        if (obj == null){
            synchronized(A.class){
                if (obj == null){
                    obj = new A();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }

    protected Object readResolve() {
        return getA();
    }
}

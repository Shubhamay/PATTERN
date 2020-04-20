package com.company.creational.AbstractFacotryDesignPattern;

abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

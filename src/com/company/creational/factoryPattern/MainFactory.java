package com.company.creational.factoryPattern;

public class MainFactory {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan domesticPlan = planFactory.getPlan("DomesticPlan");
        Plan commercialPlan = planFactory.getPlan("CommercialPlan");


    }
}

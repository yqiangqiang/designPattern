package com.template;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

//    boolean customerWantscondiments() {
//        return false;
//    }

}

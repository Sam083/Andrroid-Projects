package com.example.dependencyinjection;

import javax.inject.Inject;

public class NickleBattery implements Battery{

    @Inject
    public NickleBattery() {
    }

    @Override
    public void showType() {
        System.out.println("Nickle Battery");
    }
}

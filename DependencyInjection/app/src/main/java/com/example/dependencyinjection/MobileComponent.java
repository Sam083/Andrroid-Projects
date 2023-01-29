package com.example.dependencyinjection;

import dagger.Component;

@Component(modules = NickleBatteryModule.class)
public interface MobileComponent {
    Mobile getMobile();
}

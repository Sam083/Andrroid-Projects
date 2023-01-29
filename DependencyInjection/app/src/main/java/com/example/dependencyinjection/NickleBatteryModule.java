package com.example.dependencyinjection;

import dagger.Module;
import dagger.Provides;

@Module
public class NickleBatteryModule {

    @Provides
    Battery providesNickleBattery(NickleBattery nickleBattery){
        return nickleBattery;
    }
}

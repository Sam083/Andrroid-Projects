package com.example.dependencyinjection;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private MemoryCard memoryCard;
    private Cpu cpu;

    @Inject
    public Mobile(Battery battery, MemoryCard memoryCard, Cpu cpu) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.cpu = cpu;
    }




}

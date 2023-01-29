package com.example.dependencyinjection;

import javax.inject.Inject;

public class Cpu {

    Processor processor;

    @Inject
    public Cpu(Processor processor) {
        this.processor = processor;
    }
}

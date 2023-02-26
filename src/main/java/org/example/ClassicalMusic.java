package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing ClassicalMusic initialization");
    }
    @PreDestroy
    public void doMyDestry(){
        System.out.println("Doing ClassicalMusic destruction");
    }

    @Override
    public String getSong() {
        return "Песня из класической музыки";
    }
}

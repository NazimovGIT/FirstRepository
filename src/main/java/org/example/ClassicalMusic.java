package org.example;

import org.springframework.stereotype.Component;

@Component ("classicalMusic")
public class ClassicalMusic implements Music{
    /*public void doMyInit(){
        System.out.println("Doing ClassicalMusic initialization");
    }
    public void doMyDestry(){
        System.out.println("Doing ClassicalMusic destruction");
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }*/

    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Песня из класической музыки";
    }
}

package org.example;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Песня из рок музыки";
    }
}
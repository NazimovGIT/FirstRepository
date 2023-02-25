package org.example;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Песня из рок музыки";
    }
}

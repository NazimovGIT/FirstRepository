package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;
    @PostConstruct
    public void doMyInit(){

        System.out.println("Doing MusicPlayer initialization");
    }
    @PreDestroy
    public void doMyDestry(){
        System.out.println("Doing MusicPlayer destruction");
    }

    //применяем принцип IoC (инверсия управления)
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        System.out.println("Играет: " + music1.getSong() + ", "
                + music2.getSong());
    }
}

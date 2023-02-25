package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //List<Music> musics = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

/*    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }*/
    /*public void doMyInit(){
        System.out.println("Doing MusicPlayer initialization");
    }
    public void doMyDestry(){
        System.out.println("Doing MusicPlayer destruction");
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    //применяем принцип IoC (инверсия управления)
    public MusicPlayer (Music music){
        this.music=music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Играет: " + music.getSong());
    }
/*    public void playMusics(){
        for (Music music:musics) {
            System.out.println("Играет: ");
            System.out.println(music.getSong());
        }
    }*/
}

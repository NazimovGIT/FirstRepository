package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    List<Music> musicList;
    /*private Music music1;
    private Music music2;*/

    //применяем принцип IoC (инверсия управления)
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("popMusic") Music music3) {
        List<Music> musicList = new ArrayList<Music>();
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        this.musicList = musicList;
    }

    //@Autowired
    /*public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }*/

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println(musicList.get(random.nextInt(3)).getSong());
    }
}

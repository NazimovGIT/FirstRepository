package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        /*Music classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        // вернется тот же объект из контекста, метод doMyInit()
        // вызовится спрингом при помещении в контекст и только один раз,
        // т.к. scope="singleton", метод doMyDestry() вызовится на context.close():
        Music classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1); //true - ссылка одна и та же

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // вернется новый объект, метод doMyInit() будет вызоваться спрингом каждый раз при getBean,
        // т.к. scope="prototype", метод doMyDestry() не будет вызываться:
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer == musicPlayer1); //false - ссылки разные*/

        context.close();
    }
}

package org.string.practise.IoC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.string.practise.SpringConfiguration;

public class IoC {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class)){
            MusicPlayer mp = context.getBean("MusicPlayer", MusicPlayer.class);
            mp.playMusic(GenreOfMusic.POP);
        }
    }
}

package org.string.practise.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoC {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer mp = context.getBean("MusicPlayer", MusicPlayer.class);
        mp.playMusic();

        context.close();
    }
}

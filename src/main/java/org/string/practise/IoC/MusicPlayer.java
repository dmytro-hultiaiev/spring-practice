package org.string.practise.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

enum GenreOfMusic {
    CLASSIC, ROCK, POP
}

@Component("MusicPlayer")
public class MusicPlayer {
    private ClassicMusic classic;
    private RockMusic rock;
    private PopMusic pop;

    @Autowired
    public MusicPlayer(ClassicMusic classic, RockMusic rock, PopMusic pop) {
        this.classic = classic;
        this.rock = rock;
        this.pop = pop;
    }
    public void playMusic(GenreOfMusic genreOfMusic){
        Random chooseSong = new Random();

        switch (genreOfMusic){
            case POP:
                System.out.println(pop.getPopList().get(chooseSong.nextInt(pop.getPopList().size())));
                break;
            case ROCK:
                System.out.println(rock.getRockList().get(chooseSong.nextInt(rock.getRockList().size())));
                break;
            case CLASSIC:
                System.out.println(classic.getClassicList().get(chooseSong.nextInt(classic.getClassicList().size())));
                break;
            default:
                System.out.println("Error to choose song!");
        }
    }
}

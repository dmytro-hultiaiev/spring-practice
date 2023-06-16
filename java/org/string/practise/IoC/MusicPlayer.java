package org.string.practise.IoC;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void playMusic(){
        for(Music elem : musicList){
            System.out.println("Playing: " + elem.getSong());
        }
    }
}

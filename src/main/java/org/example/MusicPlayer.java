package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;
    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

//    public MusicPlayer() {
//    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }

//    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    public Music getMusic() {
//        return music;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public int getVolume() {
        return volume;
    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    public /*void*/ String playMusic() {
//        return "Playing: " + classicalMusic.getSong();
//        return "Playing: " + music.getSong();
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//        System.out.println("Playing: " + music.getSong());
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
//                "classicalMusic" + classicalMusic +
//                "rockMusic" + rockMusic +
//                "music=" + music +
                "music=" + music1 +
                "music=" + music2 +
//                ", name='" + name + '\'' +
//                ", volume=" + volume +
                '}';
    }
}

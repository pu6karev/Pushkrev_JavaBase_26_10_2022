package com.hillel.pushkarev.lessons.homework16;

public class ClassicMusic extends MusicStyle {


    public ClassicMusic(String singer, String composition) {
        super(singer, composition);
    }

    @Override
    void playMusic() {
        System.out.println("Composition " + composition + " is playing");
    }
}

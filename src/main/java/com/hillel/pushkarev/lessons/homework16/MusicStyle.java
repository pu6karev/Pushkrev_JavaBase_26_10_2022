package com.hillel.pushkarev.lessons.homework16;

public abstract class MusicStyle {

    protected String singer;
    protected String composition;

    protected String getSinger() {
        return singer;
    }

    protected void setSinger(String singer) {
        this.singer = singer;
    }

    protected void setComposition(String composition) {
        this.composition = composition;
    }

    protected String getComposition() {
        return composition;
    }

    public MusicStyle(String singer, String composition) {
        this.singer = singer;
        this.composition = composition;
    }

    abstract void playMusic();
}

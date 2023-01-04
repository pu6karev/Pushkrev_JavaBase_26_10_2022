package com.hillel.pushkarev.lessons.homework16;

public class MainStart {
    public static void main(String[] args) {

        // --- создадим массив с группами, играющими разные стили
        MusicStyle[] group = new MusicStyle[3];

        group[0] = new PopMusic("Michael Jackson", "Billie Jean");
        group[1] = new RockMusic("Freddie Mercury", "The Show Must Go On");
        group[2] = new ClassicMusic("Beethoven", "Moonlight Sonata");

        for (MusicStyle ms : group) {
            System.out.println(ms.getSinger());
            ms.playMusic();
        }

    }
}

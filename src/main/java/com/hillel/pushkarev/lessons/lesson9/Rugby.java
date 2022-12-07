package com.hillel.pushkarev.lessons.lesson9;

public class Rugby {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

         // --- заводим возраст игроков первой команды
        for (int i = 0; i < team1.length; i++) {
            int rand = (int) (Math.random() * 23) + 18;     // число от 18 до 40
            team1[i] = rand;
        }

         // --- заводим возраст игроков второй команды
        for (int i = 0; i < team2.length; i++) {
            int rand = (int) (Math.random() * 23) + 18;     // число от 18 до 40
            team2[i] = rand;
        }

        // --- выводим возраст игроков первой команды
        System.out.print("Возраст команды №1: ");
        for (int i = 0; i < team1.length; i++) {
            System.out.print(team1[i] + ((i != team1.length-1)? ", ":"\n"));
        }

        // --- выводим возраст игроков второй команды
        System.out.print("Возраст команды №2: ");
        for (int i = 0; i < team2.length; i++) {
            System.out.print(team2[i] + ((i != team2.length-1)? ", ":"\n"));
        }

        // --- выводим средний возраст игроков первой команды
        int sumAge1 = 0;
        for (int i : team1) {
            sumAge1 += i;
        }
        double avg1 = (double) sumAge1 / team1.length;
        System.out.println("Средний возраст команды 1: " + avg1 + " лет");

        // --- выводим средний возраст игроков второй команды
        int sumAge2 = 0;
        for (int i : team2) {
            sumAge2 += i;
        }
        double avg2 = (double) sumAge2 / team2.length;
        System.out.println("Средний возраст команды 2: " + avg2 + " лет");
    }
}

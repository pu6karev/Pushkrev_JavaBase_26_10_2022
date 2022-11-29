package com.hillel.pushkarev.lessons.lesson6;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {

        String nameTeam1;       // название первой команды
        String nameTeam2;       // название второй команды

         // --- фраги для пяти игроков 1-й команды
        double t1FragPlayer1;
        double t1FragPlayer2;
        double t1FragPlayer3;
        double t1FragPlayer4;
        double t1FragPlayer5;

        // --- фраги для пяти игроков 2-й команды
        double t2FragPlayer1;
        double t2FragPlayer2;
        double t2FragPlayer3;
        double t2FragPlayer4;
        double t2FragPlayer5;

        int numbOfPlayers1 = 0;     // кол-во игроков из 1-й команды
        int numbOfPlayers2 = 0;     // кол-ва игроков из 2-й команды
        double avgTeam1;        // среднее кол-во фрагов команды
        double avgTeam2;        // среднее кол-во фрагов команды


        Scanner scanner = new Scanner(System.in);

    // ***** 1-я команда *****
        System.out.println("Пожалуйста, введите имя 1-й команды");
        nameTeam1 = scanner.nextLine();
        //System.out.println(nameTeam1);

        System.out.println("Пожалуйста, введите фраги 1-го игрока из команды " + nameTeam1 + ":");
        t1FragPlayer1 = scanner.nextInt();      // считываем число-фраги
        scanner.nextLine();                     // для принятия "Enter" после ввода числа
        System.out.println("Спасибо. Вы ввели " + t1FragPlayer1 + " фрагов для игрока " + ++numbOfPlayers1 + "\n");

        System.out.println("Пожалуйста, введите фраги 2-го игрока из команды " + nameTeam1 + ":");
        t1FragPlayer2 = scanner.nextInt();      // считываем число-фраги
        scanner.nextLine();                     // для принятия "Enter" после ввода числа
        System.out.println("Спасибо. Вы ввели " + t1FragPlayer2 + " фрагов для игрока " + ++numbOfPlayers1 + "\n");

        System.out.println("Пожалуйста, введите фраги 3-го игрока из команды " + nameTeam1 + ":");
        t1FragPlayer3 = scanner.nextInt();      // считываем число-фраги
        scanner.nextLine();                     // для принятия "Enter" после ввода числа
        System.out.println("Спасибо. Вы ввели " + t1FragPlayer3 + " фрагов для игрока " + ++numbOfPlayers1 + "\n");

        System.out.println("Пожалуйста, введите фраги 4-го игрока из команды " + nameTeam1 + ":");
        t1FragPlayer4 = scanner.nextInt();      // считываем число-фраги
        scanner.nextLine();                     // для принятия "Enter" после ввода числа
        System.out.println("Спасибо. Вы ввели " + t1FragPlayer4 + " фрагов для игрока " + ++numbOfPlayers1 + "\n");

        System.out.println("Пожалуйста, введите фраги 5-го игрока из команды " + nameTeam1 + ":");
        t1FragPlayer5 = scanner.nextInt();      // считываем число-фраги
        scanner.nextLine();                     // для принятия "Enter" после ввода числа
        System.out.println("Спасибо. Вы ввели " + t1FragPlayer5 + " фрагов для игрока " + ++numbOfPlayers1 + "\n");

        // ***** 2-я команда *****
        System.out.println("Пожалуйста, введите имя 2-й команды");
        nameTeam2 = scanner.nextLine();
        //System.out.println(nameTeam2);

        System.out.println("Пожалуйста, введите фраги 1-го игрока из команды " + nameTeam2 + ":");
        t2FragPlayer1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Спасибо. Вы ввели " + t2FragPlayer1 + " фрагов для игрока " + ++numbOfPlayers2 + "\n");

        System.out.println("Пожалуйста, введите фраги 2-го игрока из команды " + nameTeam2 + ":");
        t2FragPlayer2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Спасибо. Вы ввели " + t2FragPlayer2 + " фрагов для игрока " + ++numbOfPlayers2 + "\n");

        System.out.println("Пожалуйста, введите фраги 3-го игрока из команды " + nameTeam2 + ":");
        t2FragPlayer3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Спасибо. Вы ввели " + t2FragPlayer3 + " фрагов для игрока " + ++numbOfPlayers2 + "\n");

        System.out.println("Пожалуйста, введите фраги 4-го игрока из команды " + nameTeam2 + ":");
        t2FragPlayer4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Спасибо. Вы ввели " + t2FragPlayer4 + " фрагов для игрока " + ++numbOfPlayers2 + "\n");

        System.out.println("Пожалуйста, введите фраги 5-го игрока из команды " + nameTeam2 + ":");
        t2FragPlayer5 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Спасибо. Вы ввели " + t2FragPlayer5 + " фрагов для игрока " + ++numbOfPlayers2 + "\n");

        avgTeam1 = (t1FragPlayer1 + t1FragPlayer2 + t1FragPlayer3 + t1FragPlayer4 + t1FragPlayer5) / numbOfPlayers1;
        System.out.println("У команды " + nameTeam1 + " среднее количество балов = " + avgTeam1);

        avgTeam2 = (t2FragPlayer1 + t2FragPlayer2 + t2FragPlayer3 + t2FragPlayer4 + t2FragPlayer5) / numbOfPlayers2;
        System.out.println("У команды " + nameTeam2 + " среднее количество балов = " + avgTeam2);

        if(avgTeam1 > avgTeam2){
            System.out.println("Победа команды " + nameTeam1);
        } else if(avgTeam1 < avgTeam2){
            System.out.println("Победа команды " + nameTeam2);
        } else{
            System.out.println("В этот раз ничья");
        }
    }



}

package com.hillel.pushkarev.lessons.lesson11;

import java.util.Scanner;

public class ArrayMN {
    public static void main(String[] args) {

        int rows;
        int columns;

        Scanner scanner = new Scanner(System.in);

        // --- Ввод с консоли первого числа
        System.out.println("Пожалуйста, введите первую размерность:");

        while (true){
            if (scanner.hasNextInt()){
                rows = scanner.nextInt();           // считывания 1-го числа в переменную
                scanner.nextLine();                 // сброс переноса строки после ввода числа
                break;
            } else {
                System.out.println("Ошибка ввода, попробуйте еще раз ввести число.");
                scanner.nextLine();
            }
        }

        // --- Ввод с консоли второго числа
        System.out.println("Пожалуйста, введите вторую размерность:");

        while (true){
            if (scanner.hasNextInt()){
                columns = scanner.nextInt();        // считывания 2-го числа в переменную
                scanner.nextLine();                 // сброс переноса строки после ввода числа
                break;
            } else {
                System.out.println("Ошибка ввода, попробуйте еще раз ввести число.");
                scanner.nextLine();
            }
        }

         // --- создаем массив нужной размерности и заполнем его числами
        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 100) + 1;   // от 1 до 100
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // --- транспонируем массив
        System.out.println("-----");
        int[][] arrTrans = new int[columns][rows];     // в новом массиве строки и столбцы меняем местами
        // --- строки первого массива записываем в столбцы второго, и столбцы первого массива в строки вторго массива
        // --- для этого просто отзеркалим индексы
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrTrans[j][i] = array[i][j];
            }
        }

        // --- вывод в консоль транспонированного массива
        for (int[] row : arrTrans) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

    }
}

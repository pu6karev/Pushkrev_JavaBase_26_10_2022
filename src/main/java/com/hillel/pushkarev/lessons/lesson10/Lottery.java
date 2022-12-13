package com.hillel.pushkarev.lessons.lesson10;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int[] arrCompany = new int[7];
        int[] arrPlayer = new int[7];
        int nCoinc = 0;                                             // счетчик совпадений


        // --- заполняем массивы случайными числами от 0 до 9
        for (int i = 0; i < arrCompany.length; i++) {
            arrCompany[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arrCompany));

        for (int i = 0; i < arrPlayer.length; i++) {
            arrPlayer[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arrPlayer));

        // --- сортируем массивы по возрастанию
        Arrays.sort(arrCompany);
        Arrays.sort(arrPlayer);
        System.out.println("Отсортированные:");
        System.out.println(Arrays.toString(arrCompany));
        System.out.println(Arrays.toString(arrPlayer));

        // --- проверим совпавшие значения и соберем индексы совпадения в отдельный массив
        for (int i = 0; i < arrCompany.length; i++) {
            if (arrCompany[i] == arrPlayer[i]) {
                nCoinc++;
            }
        }

        System.out.println("Количество совпадений: " + nCoinc);
    }
}

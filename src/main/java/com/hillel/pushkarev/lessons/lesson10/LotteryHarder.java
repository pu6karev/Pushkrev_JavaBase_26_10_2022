package com.hillel.pushkarev.lessons.lesson10;

import java.util.Arrays;

public class LotteryHarder {
    public static void main(String[] args) {

        int[] arrCompany = new int[7];
        int[] arrPlayer = new int[7];

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
        int[] arrTemp = new int[7];
        int nCoinc = 0;                                             // счетчик совпадений
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = -1;
            if (arrCompany[i] == arrPlayer[i]) {
                arrTemp[nCoinc] = i;
                nCoinc++;
            }
        }

        System.out.println("Массив с совпавшими индексами:");
        System.out.println(Arrays.toString(arrTemp));

        // --- копируем в новый массив только совпавшие индексы
        int[] arrCoincID = Arrays.copyOf(arrTemp, nCoinc);

        // --- вывод сообщения
        if (arrCoincID.length > 0){
            System.out.println("Совпали " + arrCoincID.length + " элемента(ов) " +
                               " со след.индексами " + Arrays.toString(arrCoincID));
        } else {
            System.out.println("Нет выигрышных номеров, ни один элемент не совпал.");
        }

    }
}

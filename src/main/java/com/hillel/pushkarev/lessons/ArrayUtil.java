package com.hillel.pushkarev.lessons;





public class ArrayUtil {

    // --- метод № 1 - для подсчета среднего значения элементов массива
    // если передан пустой массив вернуть -1
    // если передан null вернуть -2

    public static double arrayAvg(int[] array){

        if(array == null){
            return -2;
        }

        if(array.length == 0){
            return -1;
        }

        double sum = 0;

        for (int elem: array) {
            sum += elem;
        }

        return (sum / array.length);
    }


    // *****************************************
    // --- метод № 2 - для проверки массива на квадратность
    // если передан пустой массив вернуть -1
    // если передан null вернуть -2
    // если массив квадратный вернуть 1
    // в остальных случаях вернуть 0

    public static int arrayCheckSquare(int[][] array2){

        if(array2 == null){
            return -2;
        }

        if(array2.length == 0){
            return -1;
        }

        if(array2.length == array2[0].length){
            return 1;
        }

        return 0;
    }
}

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
    // если массив не квадратный вернуть -3
    // если массив квадратный вернуть 1

    public static int arrayCheckSquare(int[][] array2){

        if(array2 == null){
            return -2;
        }

        if(array2.length == 0){
            return -1;
        }


        // если размеру 1-й строки не соотв. размер хотя бы одной из колонок, массив - не квадрат
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if(array2.length != array2[0].length){
                    return -3;
                }
            }
        }

        return 1;
    }
}

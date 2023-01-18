package com.hillel.pushkarev.lessons.homework18;

import com.hillel.pushkarev.lessons.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestArrayUtil {

    // --- метод № 1 - для подсчета среднего значения элементов массива
    // если передан пустой массив вернуть -1
    // если передан null вернуть -2
    @Test
    public void test1(){
        int[] array = new int[0];
        Assertions.assertEquals(-1, ArrayUtil.arrayAvg(array));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(-2, ArrayUtil.arrayAvg(null));
    }

    // *****************************************
    // --- метод № 2 - для проверки массива на квадратность
    // если передан пустой массив вернуть -1
    // если передан null вернуть -2
    // если массив квадратный вернуть 1
    // в остальных случаях вернуть 0

    @Test
    public void test3(){
        int[][] array = new int[0][];
        Assertions.assertEquals(-1, ArrayUtil.arrayCheckSquare(array));
    }

    @Test
    public void test4(){
        int[][] array = null;
        Assertions.assertEquals(-2, ArrayUtil.arrayCheckSquare(array));
    }

    @Test
    public void test5(){
        int[][] array = new int[5][5];
        Assertions.assertEquals(1, ArrayUtil.arrayCheckSquare(array));
    }

}

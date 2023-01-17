package com.hillel.pushkarev.lessons;

public class ArrayUtil {

    int[] arrayBasket = {5, 10, 12, 18, 36};

    public double arrayAvg(int[] array){
        double sum = 0;

        for (int elem: array) {
            sum += (double) elem;
        }

        return (sum / array.length);
    }
}

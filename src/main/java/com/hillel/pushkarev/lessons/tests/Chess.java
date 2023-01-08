package com.hillel.pushkarev.lessons.tests;

public class Chess {

    public static void main(String[] args) {

        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i%2 == 0 && j%2 == 0 ) array[i][j] = "B";
                else if(i%2 == 1 && j%2 == 1 ) array[i][j] = "B";
                else array[i][j] = "W";

                //if(i%2 == 1 && j%2 == 1 ) array[i][j] = "W";
                ///else if(i%2 == 1 && j%2 == 1 ) array[i][j] = "B";
                //else array[i][j] = "W";
            }


        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

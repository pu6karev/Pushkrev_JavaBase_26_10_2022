package com.hillel.pushkarev.lessons.lesson8;

public class LuckyShattles {
    public static void main(String[] args) {

        int maxShips = 100;
        int unlucky1 = 4;
        int unlucky2 = 9;

        for (int i = 1; i <= maxShips; i++) {

            int lastDigit = i % 10;
            int rest = i / 10;

            if(lastDigit == unlucky1 || lastDigit == unlucky2 || rest == unlucky1 || rest == unlucky2){
                continue;
            }

            System.out.println("Кораблю присвоен счастливый номер " + i);
            
        }
    }
}

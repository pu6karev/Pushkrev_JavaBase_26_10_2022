package com.hillel.pushkarev.lessons.lesson8a;

public class LuckyShattles {
    public static void main(String[] args) {

        int maxShips = 100;     // кол-во шатлов, которым нужно присвоить номера
        int countShips = 0;
        int unlucky1 = 4;
        int unlucky2 = 9;

        for (int i = 1; ; i++) {

            int numbForCheck = i;
            boolean isFoundUnluck = false;

            // --- проверяем ост. от деления, потом отсекаем последнюю цифру и в новом числе снова проверка ост.деления
            while (numbForCheck > 1){
                int lastDigit = numbForCheck % 10;
                // --- если число содержит в себе несчастливую цифру, прерываем цикл
                isFoundUnluck = (lastDigit == unlucky1 || lastDigit == unlucky2);
                if(isFoundUnluck){
                    break;
                }
                // пока > 10, делим на 10, чтобы откинуть последнюю цифру и на след.итерации, проверим ост.от деления
                numbForCheck /= 10;
            }

            // --- если в цикле while() было обнаружено несчастливое число, вернемся к началу цикла for()
            if(isFoundUnluck) {
                continue;
            }

            // --- раз дошли сюда, значит не встретили несчастливых чисел, считаем кол-во
            countShips++;

            if(countShips >= maxShips){             // достигли максимального кол-ва нужных номеров шатлов
                System.out.print(i + ".");                // вывод последнего номера
                break;
            }

            System.out.print(i + (countShips%20 == 0 ? ",\n" : ","));       // вывод номеров по 20 чисел в строке
        }
    }
}

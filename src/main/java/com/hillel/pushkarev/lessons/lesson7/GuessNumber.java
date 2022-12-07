package com.hillel.pushkarev.lessons.lesson7;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int minDiapazon = 1;                                // мин.диапазон для угадывания числа
        int maxDiapazon = 10;                               // макс.диапазон для угадывания числа
        int trying = 3;                                     // макс.кол-во попыток для угадывания
        int randNumber = (int) (Math.random() * 10) + 1;    // случайное число от 1 до 10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Компьютер загадал число от 1 до 10, пожалуйста, угадайте его");


        int countTrying = 0;        // счетчик попыток

        while (true) {

            if (scanner.hasNextInt()){
               int customNumb = scanner.nextInt();      // считываем числа, введенные пользователем
               scanner.nextLine();

               if (customNumb < minDiapazon || customNumb > maxDiapazon){
                   System.out.println("Вы ввели число из неправильного диапазона попробуйте еще раз");
               } else if(randNumber == customNumb){
                   System.out.println("Поздравляем, вы угадали!!!");
                   break;
               } else {
                   countTrying++;

                   if (countTrying >= trying){
                       System.out.println("Вы не смогли угадать число " + randNumber + " за " + countTrying + " попыток(ки)");
                       break;
                   }
                   String where = (randNumber > customNumb) ? "побольше" : "поменьше";
                   System.out.println("" + countTrying + "-я попытка неудачная, попробуйте еще раз число " + where);
               }


            } else{
                System.out.println("Неправильное значение, введите число");
                scanner.nextLine();
            }
        }
    }
}

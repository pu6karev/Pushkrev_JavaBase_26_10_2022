package com.hillel.pushkarev.lessons.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {

        int id = 0;                                     // id заказа, размещаемого в массиве
        Drinks[] arrayOrder = new Drinks[10];           // массив для заказов по напиткам

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("\nВведите один из напитков ниже или команду EXIT для выхода:");
            System.out.println(Arrays.toString(DrinksMachine.values()));

            String usersDrink = scanner.nextLine().toUpperCase();
            DrinksMachine drinkForPrepare = null;

            for (DrinksMachine eDrink : DrinksMachine.values()) {
                // --- если ввод от пользователя соответствует одному из объектов перечисления
                if(eDrink.toString().equals(usersDrink)) {
                    // --- из пользовательского ввода сохраним в нашу переменную-перечисление
                    drinkForPrepare = DrinksMachine.valueOf(usersDrink);
                    // --- собираем все заказы в массив для вывода в конце заказа
                    arrayOrder[id] = new Drinks(drinkForPrepare);
                    ++id;
                    // --- вызов метода перечисления о приготовлении напитка
                    drinkForPrepare.cooking();
                    break;
                }
            }

            // --- условие для выхода
            if(usersDrink.equals("EXIT")){
                System.out.println("Вы заказали в итоге:");
                // --- переберем весь массив с заказанными напитками клиента и выведем
                for(Drinks drinks : arrayOrder) {
                    if(drinks != null) {
                        System.out.println(drinks.getDrinkName() + " = $" + drinks.getPRICE());
                    } else break;
                }

                System.out.println("Спасибо за заказ. Общая стоимость = $" + Drinks.getSumCounter());
                break;
            }

            if(drinkForPrepare == null){
                System.out.println("Неправильный ввод, попробуйте еще раз");
            }
        }

    }
}

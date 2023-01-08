package com.hillel.pushkarev.lessons.homework17;

public class Drinks {
    private final DrinksMachine drinkName;  // имя напитка из перечисления
    private double PRICE;                   // цена напитка
    private static double sumCounter;       // общий счетчик суммы для итога в конце заказа

    // --- константы по условию #2 из задания
    private final double PRICE_COFFEE = 15;
    private final double PRICE_TEA = 5;
    private final double PRICE_LEMONADE = 7;
    private final double PRICE_MOJITO = 18;
    private final double PRICE_MINERALS = 4;
    private final double PRICE_COLA = 12;


    // --- конструктор с определением цены напитка по одной из констант и подсчетом итоговой суммы заказа
    public Drinks(DrinksMachine drinkName) {

        switch (drinkName){
            case COFFEE     : PRICE = PRICE_COFFEE; break;
            case TEA        : PRICE = PRICE_TEA; break;
            case LEMONADE   : PRICE = PRICE_LEMONADE; break;
            case MOJITO     : PRICE = PRICE_MOJITO; break;
            case MINERALS   : PRICE = PRICE_MINERALS; break;
            case COLA       : PRICE = PRICE_COLA; break;
        }

        this.drinkName = drinkName;             // имя напитка
        sumCounter += PRICE;                    // суммируем стоимость всех заказов
    }

    // --- геттеры
    public DrinksMachine getDrinkName() {
        return drinkName;
    }

    public double getPRICE() {
        return PRICE;
    }

    public static double getSumCounter() {
        return sumCounter;
    }
}

package com.hillel.pushkarev.lessons.homework17;

public enum DrinksMachine {

    COFFEE("Американо", "Nescafe", "сахар"),
    TEA("Чай", "Байховые листья", "лимон"),
    LEMONADE("Лимонад", "Сок", "очищенная вода"),
    MOJITO("Мохито", "Мята", "лимон"),
    MINERALS("Минеральная вода", "Очищенная вода", "газ"),
    COLA("Кока-Кола", "Кола", "лед");

    private final String name;
    private final String ingredient1;
    private final String ingredient2;

    DrinksMachine(String name, String ingredient1, String ingredient2) {
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
    }

    void cooking(){
        System.out.println("Ваш напиток " + name + " готовится из след.ингридиентов: " + ingredient1 + ", " + ingredient2);
        System.out.println("Пожалуйста, ожидайте ...");
        System.out.println("Готово!");
    }
}

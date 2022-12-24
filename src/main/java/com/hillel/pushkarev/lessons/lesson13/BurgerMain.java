package com.hillel.pushkarev.lessons.lesson13;

public class BurgerMain {
    public static void main(String[] args) {

        // создание трех объектов одного класса с использование трех разных конструкторов

        Burger burgerDietic = new Burger("воздушная булочка", "куринное филе", "пармезан",
                                       "зелень");

        Burger burgerDoubleMeat = new Burger("воздушная булочка", "куринное филе", "свинина",
                                            "пармезан", "зелень", "майонез");

        Burger burgerStandart = new Burger("воздушная булочка", "куринное филе", "пармезан",
                                         "зелень", "майонез");
    }
}

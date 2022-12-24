package com.hillel.pushkarev.lessons.lesson13;

public class Burger {
    String bun;
    String meat1;
    String meat2;
    String cheese;
    String greens;
    String mayonnaise;

    // --- конструктор для обычного бургера
    public Burger(String bun, String meat1, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        printInfo("стандарт", true, true, false, true, true, true);
    }

    // --- конструктор для диетического бургера без майонеза
    public Burger(String bun, String meat1, String cheese, String greens) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;

        printInfo("диетический", true, true, false, true, true, false);
    }

    // --- конструктор для бургера с двойным мясом
    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        printInfo("двойное мясо", true, true, true, true, true, true);
    }

    void printInfo(String type, boolean isBun, boolean isMeat1, boolean isMeat2, boolean isCheese, boolean isGreens,
                   boolean isSauce){
        String name = "Ваш бургер \"" + type + "\":";
        if(isBun) name += " " + bun;
        if(isMeat1) name +=  ", " + meat1;
        if(isMeat2) name +=  ", " + meat2;
        if(isCheese) name +=  ", " + cheese;
        if(isGreens) name +=  ", " + greens;
        if(isSauce) name +=  ", " + mayonnaise;

        System.out.println(name + ".");
    }
}

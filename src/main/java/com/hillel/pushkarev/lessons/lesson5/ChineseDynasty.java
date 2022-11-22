package com.hillel.pushkarev.lessons.lesson5;

public class ChineseDynasty {
    public static void main(String[] args) {

      // **** Армия династии Ли ****
         // --- показатели атаки по каждому виду воина
        double warriorAttack = 13;
        double archerAttack = 24;
        double riderAttack = 46;
         // --- количество воинов каждого вида одинаково
        int soldierNumber = 860;
         // --- расчет общего показателя армии по всем видам воинов
        double totalPower = (warriorAttack + archerAttack + riderAttack) * soldierNumber;

        System.out.println("Общий показатель аттаки армии Ли = " + totalPower);

      // **** Армия династии Минь ****
         // --- показатели атаки по каждому виду воина
        warriorAttack = 9;
        archerAttack = 35;
        riderAttack = 12;
         // --- расчет общего показателя армии по всем видам воинов, которых в 1,5 раза больше
        totalPower = (warriorAttack + archerAttack + riderAttack) * soldierNumber * 1.5;

        System.out.println("Общий показатель аттаки армии Минь = " + totalPower);

    }
}

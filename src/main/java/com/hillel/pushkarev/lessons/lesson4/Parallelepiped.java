package com.hillel.pushkarev.lessons.lesson4;

public class Parallelepiped {
    public static void main(String[] args) {

         // --- стороны параллелепипеда
        double a = 5;
        double b = 6;
        double c = 7;

         // --- расчет объема
        double volume = a * b * c;
        System.out.println("Volume = " + volume);

         // --- расчет длины всех ребер
        double length = (a + b + c) * 4;
        System.out.println("Sum of length = " + length);
    }
}

package com.hillel.pushkarev.lessons.lesson2;

public class MyApp {
    public static void main(String[] args) {

        char symbGrade  = '\u00B0';     // символ градуса
        char symbMinute = 39;           // символ минуты, апостроф
        char symbSecond = 34;           // символ секунды, двойная кавычка

        String dmsLatitude = "46" + symbGrade + " 29" + symbMinute + " 7.7316" + symbSecond + " N";
        String dmsLongitude = "30" + symbGrade + " 44" + symbMinute + " 27.8736" + symbSecond + " E";

        System.out.println("Odessa Opera and Ballet Theatre - " + dmsLatitude + " " + dmsLongitude);
    }
}

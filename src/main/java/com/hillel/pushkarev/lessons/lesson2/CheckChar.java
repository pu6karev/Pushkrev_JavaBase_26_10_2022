package com.hillel.pushkarev.lessons.lesson2;

public class CheckChar {
    public static void main(String[] args) {

        char symbMinute = 39;           // символ минуты, апостроф
        char symbSecond = 34;           // символ секунды, двойная кавычка


        char symbSecondUC = '\u0022';   // символ секунды, двойная кавычка, юникод
        //char symbMinuteUC = '\u0027';   // символ минуты, апостроф, юникод







        String sSymbMinuteUC = "\u0027";

        System.out.println(symbMinute);
        System.out.println(symbSecond);
        //System.out.println(symbMinuteUC);
        System.out.println(symbSecondUC);
        System.out.println(sSymbMinuteUC);

    }
}

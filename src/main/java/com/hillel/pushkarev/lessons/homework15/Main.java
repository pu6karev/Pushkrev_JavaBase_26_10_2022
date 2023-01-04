package com.hillel.pushkarev.lessons.homework15;

public class Main {
    public static void main(String[] args) {

        Android android = new Android("Samsung C30", 5.5);

        android.startSystem();
        android.call();
        android.sms();
        android.internet();

        Iphone iphone = new Iphone("iPhone 10S", 6.7);

        iphone.startSystem();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}

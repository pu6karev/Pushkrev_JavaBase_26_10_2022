package com.hillel.pushkarev.lessons.lesson12;

public class Person {
    public static void main(String[] args) {

        String customer1 = personInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(customer1);

        String customer2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(customer2);

        String customer3 = personInfo("Sherlock", "Holmes", "London", "+37742123513");
        System.out.println(customer3);
    }

    static  String personInfo(String name, String surname, String city, String phoneNumber){
        String result = "Зателефонувати громадянину " + name + " " + surname + " із міста " + city +
                        " можна за номером " + phoneNumber + ".";

        return  result;
    }
}

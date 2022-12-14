package com.hillel.pushkarev.lessons.homework14;

public class Customer {

    String  name;
    int     birthday;
    int     birthMonth;
    int     birthYear;
    String  email;
    String  phone;

    String  surname;
    double  weight;
    double  pressure;
    int     stepNumber;

    private  int     age;
    int     curYear = 2020;

    // --- Конструктор ---
    public Customer(String name, String surname, int birthday, int birthMonth, int birthYear, String email, String phone,
                    double weight, double pressure, int stepNumber) {
        this.name = name;
        this.birthday = birthday;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepNumber = stepNumber;

        age = curYear - birthYear;
    }

    // --- Геттеры ---

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public double getPressure() {
        return pressure;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public int getAge() {
        return age;
    }

    // --- Сеттеры ---

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    // --- Методы ---
    public void  printAccountInfo(){
        String result = "Имя:           " + name + "\n";
        result += "Фамилия:         " + surname + "\n";
        result += "Дата рождения:   " + birthday + "." + birthMonth + "." + birthYear + "\n";
        result += "Возраст:         " + getAge() + "\n";
        result += "Вес:             " + weight + "\n";
        result += "Тел.номер:       " + phone + "\n";
        result += "Email:           " + email + "\n";
        result += "Давление:        " + pressure + "\n";
        result += "Кол-во шагов:    " + stepNumber + "\n";

        System.out.println(result);
    }


}

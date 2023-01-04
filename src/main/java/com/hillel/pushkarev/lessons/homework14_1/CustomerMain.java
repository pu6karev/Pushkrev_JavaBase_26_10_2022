package com.hillel.pushkarev.lessons.homework14_1;

public class CustomerMain {
    public static void main(String[] args) {

    Customer peter = new Customer("Петр", "Коваленко", 15, 8, 1970,
            "petre@mail.com", "+421515247", 85.5, 125.80,6000);

        Customer irina = new Customer("Ирина", "Сидорова", 10, 11, 1982,
                "riname@mail.com", "+425647878", 102.2, 118,8500);


        Customer galina = new Customer("Галина", "Терехова", 23, 12, 1981,
                "tereh@mail.com", "+4223235654", 93.3, 110.90,10000);


    peter.printAccountInfo();
    irina.printAccountInfo();
    galina.printAccountInfo();

    // --- увеличение нагрузки с 6000 шагов на 8000 шагов
    System.out.println("У клиента по имени " + peter.getName() + " раньше была нагрузка = " + peter.getStepNumber());

    peter.setStepNumber(8000);
    peter.printAccountInfo();

    // --- похудела и вышла замуж, сменив фамилию
    System.out.println("У клиента по имени " + galina.getName()  + " раньше была фамилия " + galina.getSurname() +
            ", а вес был " + galina.getWeight() + " кг.");

    galina.setWeight(73);
    galina.setSurname("Незабарова");
    galina.printAccountInfo();
    }


}

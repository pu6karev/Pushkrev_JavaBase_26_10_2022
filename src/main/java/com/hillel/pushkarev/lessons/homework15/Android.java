package com.hillel.pushkarev.lessons.homework15;

public class Android implements Smartphones, LinuxOS {
    private String model;
    private double screenSize;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Android(String model, double screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public void call() {
        System.out.println("Phone is calling...");
    }

    @Override
    public void sms() {
        System.out.println("SMS is sending...");
    }

    @Override
    public void internet() {
        System.out.println("Internet is working...");
    }

    @Override
    public void startSystem() {
        System.out.println("Linux system is runnig at your phone " + model);
    }
}

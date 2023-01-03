package com.company;

public class Modem {
    int speed;
    String method;

    public void displaySpeed() {
        System.out.println("Быстродействие: " + speed);
    }
    public void disconnect(){
        System.out.println("Отключение от интернета ...");
        System.out.println("С помощью " + method);
    }
}

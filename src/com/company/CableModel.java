package com.company;

public class CableModel extends Modem {
    String method = "кабельное подключение";

    public void connect() {
        System.out.println("Подключение к интернету...");
        System.out.println("Используем " + method);
    }
}


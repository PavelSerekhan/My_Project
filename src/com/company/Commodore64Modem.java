package com.company;

public class Commodore64Modem extends Modem{
    String method = "Modem64 - подключение";

    public void connect(){
        System.out.println("Подключение к интернету...");
        System.out.println("Используем " + method);
    }


}

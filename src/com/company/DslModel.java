package com.company;

public class DslModel extends Modem{
    String method = "DSL - подключение";

    public void connect(){
        System.out.println("Подключение к интернету...");
        System.out.println("Используем " + method);
    }



}

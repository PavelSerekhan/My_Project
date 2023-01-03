package com.company;

public class ModelTester {
    public static void main(String[] args) {
        CableModel surfBoard = new CableModel();
        DslModel gateway = new DslModel();
//        Commodore64Modem pohui = new Commodore64Modem();
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        System.out.println("Попытка подключения кабельного модема: ");


//       pohui.speed = 300;
//       pohui.displaySpeed();
//       pohui.connect();

        surfBoard.displaySpeed();
        surfBoard.connect();
        surfBoard.disconnect();

        System.out.println("Попытка подключения DSL - модема: ");

        gateway.displaySpeed();
        gateway.connect();
        gateway.disconnect();

    }
}

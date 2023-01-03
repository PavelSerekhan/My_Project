package com.company;

import java.util.ArrayList;

public class SwitchSwitch {

    //    public static void main(String[] args) {
//        int temperature = 40;
//        switch (temperature) {
//            case 36:
//                System.out.println("Низкая");
//                break;
//            case 37:
//                System.out.println("Нормальная");
//                break;
//            case 38:
//                System.out.println("Высокая");
//            default:
//                System.out.println("Вызывайте скорую!!!");
//        }
    public static void main(String[] args) {
        int count = 2;
        int value = switch (count) {
            case 1, 4, 6 -> 12;
            case 2, 7, 9 -> 32;
            case 3, 5 -> 52;
            default -> 0;

        };


    }
}



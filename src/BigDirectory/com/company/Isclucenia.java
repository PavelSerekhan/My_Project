package com.company;

import java.io.IOException;

public class Isclucenia {

    public static void main(String[] args) {
        System.out.println("Начало метода main");
        try
        {
            calculate(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Было деление на 0");
//            throw e;
        }
        catch(Exception e)
        {
            System.out.println("Перехвачено какое-то исключение");
        }
        System.out.println("Конец метода main");
    }

    public static void calculate(int n)
    {
        System.out.println("calculate начало: " + n);
        System.out.println(2/n);
        System.out.println("calculate конец: " + n);
    }



}

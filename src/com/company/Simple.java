package com.company;

public class Simple {
    class InnerSimple{
        InnerSimple(){
            System.out.println("Я внутренний класс!");
        }
    }

    public Simple() {
    }

    public static void main(String[] args) {
        Simple program = new Simple();
        Simple.InnerSimple inner = program.new InnerSimple();

    }
}
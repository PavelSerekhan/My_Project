package com.company;

public class Duck implements Swimmable{

    public void swim() {
        System.out.println("Уточка, плыви!");

    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
    }
}

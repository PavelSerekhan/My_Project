package com.company;

public class Animal {
    String brain = "Изначальное значение brain в классе Animal";
    String heart = "Изначальное значение heart в классе Animal";
    public static int animalCount = 7_700_000;

    public Animal(String heart, String brain) {
        System.out.println("Выполняется конструктор базового класса Animal");
        System.out.println("Были ли уже проинициализированы переменные класса Animal?");
        System.out.println("Текущее значение статической переменной animalCount = " + animalCount);
        System.out.println("Текущее значение brain в классе Animal = " + this.brain);
        System.out.println("Текущее значение heart в классе Animal = " + this.heart);
        System.out.println("Были ли уже проинициализированы переменные класса Cat?");
        System.out.println("Текущее значение статической переменной catsCount = ");
        this.heart = heart;
        this.brain = brain;
        System.out.println("Конструктор базового класса Animal завершил работу!");
        System.out.println("Текущее значение brain = " + this.brain);
        System.out.println("Текущее значение heart = " + this.heart);
    }
}

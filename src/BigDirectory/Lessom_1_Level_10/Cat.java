package Lessom_1_Level_10;

import java.io.*;

public class Cat extends Animal {
    private static final String ANIMAL_FAMILY = "Семейство кошачьих";

    private String name;
    private int age;

    public Cat(){

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sayMeow(){
        System.out.println("MEOW!");
    }
}

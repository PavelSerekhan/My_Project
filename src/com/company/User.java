package com.company;

public class User {
    String name;
    short age;
    int height;

    public User(String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(short age, String name, int height){

    }
    public User(short age, int height, String name){

    }
    public User(int height,short age, String name){

    }
    public User(int height, String name, short age){

    }
    public User(String name, int height, short age){

    }

    public static void main(String[] args) {
        User user = new User("Rada", 12,(short) 23);


    }
}

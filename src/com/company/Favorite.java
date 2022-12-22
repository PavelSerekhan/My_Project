package com.company;

public class Favorite {
    public static void main(String[] args) {
        String favorite = "бензопила";
        String guess = "бензопила";
        System.out.println("Любимое оружие Фина " + guess + "?");
        System.out.println("Ответ: " + favorite.equals(guess));
    }
}

package com.company;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Console {
    public static String readLine(){
        StringBuilder response = new StringBuilder();
        try {
            BufferedInputStream bin = new BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do {
                in = bin.read();
                inChar = (char) in;
                if (in != -1){
                    response.append(inChar);
                }
            }while ((in != -1) & (inChar != '\n'));
            bin.close();
            return response.toString();
        }catch (IOException ioException){
            System.out.println("Исключение: " + ioException.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.print("Ты стоишь в конце");
        System.out.print("дороги перед небольшим кирпичным зданием.");
        System.out.print("Вокруг тебя лес. Маленький ");
        System.out.print("ручей вытекает из здания ");
        System.out.print("и в низ по оврагу\n");
        System.out.print("> ");
        String input = Console.readLine();
        System.out.println("Это не тот глагол, который я узнаю");
    }
}

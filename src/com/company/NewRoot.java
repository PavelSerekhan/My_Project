package com.company;

import java.util.Scanner;

public class NewRoot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int x = Integer.parseInt(str);
        System.out.println("Квадратный корень из " + str + " равен " + Math.sqrt(x) );

    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GremlenLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int numGremlins = Integer.parseInt(str);
        if (numGremlins > 0){
            Gremlen[] gremlins = new Gremlen[numGremlins];
            for (int i = 0; i < numGremlins; i++) {
                gremlins[i] = new Gremlen();
            }
            System.out.println("Здесь " + Gremlen.getGremlinCount() + " гремлинов.");

        }
    }
}

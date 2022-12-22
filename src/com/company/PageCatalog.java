package com.company;

import java.net.MalformedURLException;

public class PageCatalog {
    public static void main(String[] args) {
        String[]arguments = {"3","2","1"};
        if (arguments.length == 3) {
            int result;
            try {
                result = Integer.parseInt(arguments[0]) *
                        Integer.parseInt(arguments[1]) *
                        Integer.parseInt(arguments[2]);
                System.out.println(arguments[0] + " times " +
                        arguments[1] + " times " + arguments[2] +
                        " equals " + result);
            } catch (NumberFormatException e) {
                System.out.println("All arguments must be numbers.");
                throw e;
            }
        }
    }
}

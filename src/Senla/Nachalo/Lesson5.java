package Senla;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        /**
         * Пользователь вводит 6-ти значное число. Программа должна разбить число
         * на разряды, и вывести в отдельной строке каждый разряд.
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String cislo = scanner.nextLine();

//        if (cislo.length() == 6){
//            int index = 0;
//            while (index < cislo.length()) {
//                System.out.println(cislo.charAt(index));
//                index++;
//            }
//        } else
//            System.out.println("Строка должна быть 6 символов");

//        for (int i = 0; i < cislo.length(); i++) {
//            System.out.println(cislo.charAt(i));
//        }
//        scanner.close();

        int a = 1_000_000;
        short b = (short)a;
        byte c = (byte) a;
        System.out.println(c);
    }
}

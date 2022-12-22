package Senla.OOP;

import java.util.Random;

public class Lesson3_1 {
    public static void main(String[] args) {
//        int i = 13579;
//        String s = "" + number;
//        System.out.println(s.charAt(s.length() - 1));
//        System.out.println(s.charAt(s.length() - 2));
//        System.out.println(s.charAt(s.length() - 3));

//   Задание 1.1
//        Random random = new Random();
//        int number = random.nextInt(999) ;
//        System.out.println("Случайное число = " + number);

//        int[] array = new int[3];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = number % 10;
//            number =  number / 10;
//        }
//        int n = 0;
//        for (int i = 0; i < array.length; i++) {
//            n = array[0];
//            if (array[i] > n){
//                n = array[i];
//            }
//        }
//        System.out.println("Наибольшее число в случайном числе = " + n);

        //    Задание 1.2
        Random random2 = new Random();
        int number2 = random2.nextInt(999);
        System.out.println("Первое случайное число = " + number2);

        int[] array2 = new int[3];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = number2 % 10;
            number2 =  number2 / 10;
        }
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = array2[1] + array2[2] + array2[0];
        }
        System.out.println("Сумма первых двух чисел = " + sum);
    }
}

package Ablazzing;

import java.util.Arrays;
import java.util.Locale;

public class Lesson_1 {
    public static void main(String[] args) {
        //Задание №1 -> Базовый уровень ----------
//        String h1 = "        Hello";
//        String world = "WoRld!";
//        char newLine = '\n';
//
//        String h2 = h1.trim() + " " + world.toLowerCase() + newLine;
//        System.out.println(h2.repeat(3));
        //Hello world!
        //Hello world!
        //Hello world!

        //Задание №2
//        double growth = 176;
//        double weight = 90;
//        System.out.println(result(growth, weight));
//    }
//
//    public static double result(double x, double y) {
//        return y / x * x;
//    }

        //Задание №3
//        char[] word = {'a', 'b', 'c', 'd', 'e'};
//        String resultWord = String.copyValueOf(word);     // сделать строку из массива
//        System.out.println(resultWord);
//        word[4] = 'h';
//        String resultNew = String.copyValueOf(word);
//        System.out.println(resultNew);

        //Задание №1 -> Продвинутый уровень -----------
//        String number = "234";
//        String text = "some_text";
//        int numberInt = Integer.parseInt(number);
//        int lengthText = text.length();
//        System.out.println(numberInt + lengthText);

        //Задание №2
//        int a = 3;
//        int b = 5;
//        int result = (a + b);
//        int res = (int) Math.pow(result,2);
//        System.out.println(res);

        //Задание №3 //    1,2,5,7,10,  2,3,2,17,15, 2,6,10,119,150
        int[] array = {1, 2, 5, 7, 10};
        int[] array2 = {2, 3, 2, 17, 15};
        int[] res = new int[5];
        res[0] = array[0] * array2[0];
        res[1] = array[1] * array2[1];
        res[2] = array[2] * array2[2];
        res[3] = array[3] * array2[3];
        res[4] = array[4] * array2[4];
        int[] bigArray = new int[15];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            bigArray[count] = array[i];
            count++;
        }

        for (int i = 0; i < array2.length; i++) {
            bigArray[count] = array2[i];
            count++;
        }

        for (int i = 0; i < res.length; i++) {
            bigArray[count] = res[i];
            count++;
        }

        for (int s : bigArray) {
            System.out.print(s + " ");
        }

        //Задание №4
//        String word = "Hello world!";
//        String res = word.replaceAll("l", "r").toUpperCase();
//        System.out.println(res.substring(0,8));

        //Экспертный уровень


    }
}

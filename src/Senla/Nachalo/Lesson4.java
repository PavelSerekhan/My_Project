package Senla.Nachalo;

import Exceptoins1.ScannerExceptions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.reverseOrder;

public class Lesson4 {
    public static void main(String[] args) {
        //1
//        int count = 0;
//        while (count <= 100){
//            System.out.println(count);
//            count++;
//        }

        //2
//        int count = 100;
//        while (count >= 0){
//            System.out.println(count);
//            count--;
//        }

        //3
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        while (a <= b) {
//            if (a % 2 == 0){
//                System.out.println(a);
//            }
//            a++;
//        }
//        for (int i = a; i < b; i++) {
//            while (i % 2 == 0){
//                System.out.println(i);
//                i++;
//            }
//        }

        //4
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = a; i < b ; i++) {
//            if (i % 3 == 0 || i % 7 == 0){
//                if (i % 5 != 0) {
//                    System.out.println(i);
//                }
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        while (a <= b){
//            if ((a % 3 == 0 || a % 7 ==0) && a % 5 != 0){
//                System.out.println(a);
//            }
//            a++;
//        }


        //5
//        Scanner scanner = new Scanner(System.in);
//        int negativeCount = 0;
//        int positiveCount = 0;
//        int zero = 0;
//
//        System.out.println("Enter n");
//        int n = scanner.nextInt();
//        int indexInput = 0;
//
//        while (indexInput < n) {
//            System.out.println("Enter number");
//            int value = scanner.nextInt();
//            if (value > 0){
//                positiveCount++;
//            } else if (value < 0){
//                negativeCount++;
//            } else  zero++;
//        }
//        indexInput++;
//
//        System.out.println("Count negative number: " + negativeCount);
//        System.out.println("Count positive number: " + positiveCount);
//        System.out.println("Count zero: " + zero);

        //6
//        int last = 3524578;
//        int current = 0;
//        int prev = 0;
//
//        while (current <= last){               //3 <= 4655545
//            System.out.println(current);       //3
//            if (current != 0){                 //true
//                int temp = current;            // temp = 3
//                current = current + prev;      //current = 3 + 2
//                prev = temp;                   // prev = 3
//            } else {
//                current = current + 1;
//            }
//        }

        //7
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число а");
//        int a = scanner.nextInt();
//        System.out.println("Введите число b");
//        int b = scanner.nextInt();
//
//        int sum = 0;
//        while (a <= b) {
//             if ((a >= 10 && b <= 99) && a % 11 == 0){
//                 sum = sum + a;
//             }
//             a++;
//        }
//        System.out.println("Сумма чисел от a до b, которые делиться на 11 = " + sum);

        //8
//        Scanner scanner = new Scanner(System.in);
//        int index = 0;
//        int n = scanner.nextInt();
//
//        while (index < n){
//            if ((index % 2) != 0 && (index % 3) !=0 && (index % 5) !=0){
//                System.out.println(index);
//            }
//            index++;
//        }

        //9
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a < b) {
//            int sum = 0;
//            while (a <= b) {
//                if (a % 2 != 0) {
//                    sum += a * a;
//                }
//                a++;
//            }
//            System.out.println(sum);
//        }else {
//            System.out.println(" a < b ");
//        }

        //10
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите кол-во слов: ");
//        int n = scanner.nextInt();
//        int count = 0;
//        String word = "";
//
//        while (count < n) {
//            System.out.println("Введите слово: ");
//            String str = scanner.next();
//            word = word + " " + str;
//            count++;
//        }
//        System.out.println(word);
//        scanner.close();

        //13
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите общий размер ткани: ");
//        double size = scanner.nextDouble();
//        double cut = 0;
//
//        while (size > 0) {
//            System.out.println("Введите число, сколько надо отрезать ткани: ");
//            cut = scanner.nextDouble();
//            if (cut < 1) {
//                System.out.println("Отрезать так мало не получится!");
//            }else if (size < cut){
//                System.out.println("Слишком много хотите отрезать!");
//            }else {
//                size -= cut;
//                System.out.println("Осталось от общего размера ткани: " + size);
//            }
//        }
//        scanner.close();

        //14
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vedite kolicestvo:");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        for (int i = array.length -1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }
//        int n = scanner.nextInt();
//        int index = 0;
//        double[] array = new double[n];
//
//        while (index < n) {
//            array[index] = scanner.nextDouble();
//            index++;
//        }
//        index = array.length - 1;
//        while (index >= 0){
//            System.out.println(array[index]);
//            index--;
//        }

        //15
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vedite kolicestvo:");
//        int[] array = new int[scanner.nextInt()];

//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        int min = array[0];
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] > max){
//                max = array[i];
//            }
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//        System.out.println("Min: " + min + ", Max: " + max);

        //16
//        int masSize = 100;
//        int index = 0;
//        int[] mas = new int[masSize];
//        int from = 0;
//        int to = 7;
//        while (index < masSize) {
//            int posled = from;
//            while (posled <= to && index < masSize) {
//                mas[index] = posled;
//                posled = posled + 1;
//                index++;
//            }
//        }
//        index = 0;
//        while (index < masSize) {
//            System.out.println(index + ":" + mas[index]);
//            index++;
//        }

        //17// делает 2 массива как надо, только через 0!
//        Scanner scanner = new Scanner(System.in);
//        int[] array1 = new int[10];
//        int[] array2 = new int[10];
//        int[] array = new int[10];
//        System.out.println("Введите кол-во элементов: ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                array1[i] = array[i];
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                array2[i] = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
        //||
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите n");
//        int n = scanner.nextInt();
//        int index = 0;
//
//        int[] chetn = new int[n];
//        int[] neChetn = new int[n];
//
//        int indexChetn = 0;
//        int indexNeChetn = 0;
//
//        while (index < n) {
//            System.out.println("Введите номер:");
//            int value = scanner.nextInt();
//            if (value % 2 == 0) {
//                chetn[indexChetn] = value;
//                indexChetn++;
//            } else {
//                neChetn[indexNeChetn] = value;
//                indexNeChetn++;
//            }
//            index++;
//        }
//        index = 0;
//        System.out.println("Четные: ");
//        while (index < n) {
//            System.out.println(chetn[index]);
//            index++;
//        }
//        index = 0;
//        System.out.println("Нечетные: ");
//        while (index < n) {
//            System.out.println(neChetn[index]);
//            index++;
//        }

        //18
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите n");
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Vvedi chislo:");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("Второй элемент: " + array[1] + "Предпоследний элемент: " +
//                array[array.length - 2]);
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        double
//        System.out.println("Остаток от деления, позиция " + array[sum/n]);
    }
}


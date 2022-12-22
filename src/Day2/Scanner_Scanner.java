package Day2;

import java.util.Scanner;

/*
Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
число, соответствующее количеству этажей в здании. Используя условный оператор if, необходимо
вывести в консоль сообщение о типе такого дома.

Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”,
9 и более - “Многоэтажный дом”. Также, необходимо учесть что может быть введено
отрицательное значение, в таком случае сообщить “Ошибка ввода”.

 */
public class Scanner_Scanner {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int a = console.nextInt();
//        if (a >= 1 && a <= 4) {
//            System.out.println("Малоэтажный дом");
//        }
//        if (a >= 5 && a <= 8) {
//            System.out.println("Среднеэтажный дом");
//        }
//        if (a >= 9) {
//            System.out.println("Многоэтажный дом");
//        } else if (a <= 0) {
//            System.out.println("Ошибка ввода");
//        }
/*
Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
(делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше
условие (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не
учитывать.
Если a >= b вывести сообщение "Некорректный ввод".
 */
        //for
//        Scanner console = new Scanner(System.in);
//        int a = console.nextInt();
//        int b = console.nextInt();
//        for (int i = a + 1; i < b; i++) {
//            if (i % 5 == 0 && i % 10 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//        if (a >= b) {
//            System.out.println("Некорректный ввод");
//        }
        //while
//        Scanner console = new Scanner(System.in);
//        int a = console.nextInt();
//        int b = console.nextInt();
//        int c = a + 1;
//        while (c < b) {
//            if (c % 5 == 0 && c % 10 != 0) {
//                System.out.print(c + " ");
//            }
//            c++;
//        }
//        if (a > b) {
//            System.out.println("Некорректный ввод");
//        }
//        console.close();

        Scanner console = new Scanner(System.in);

        double x = console.nextDouble();
        double y;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10 / (x + 7));
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        }
        else {
            y = 420;
        }
        System.out.println(y);

    }

}



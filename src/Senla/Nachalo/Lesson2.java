package Senla;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int one = scanner.nextInt();
//        int two = one * 5;
//        int three = one + two;
//        one = one + three;
//        System.out.println(one);

        Scanner scanner = new Scanner(System.in);
//        double one = scanner.nextDouble();
//        double two = scanner.nextDouble();
//        double result = one % two;
//        System.out.println(result);

//        double one = scanner.nextDouble();
//        double res = one <100 && one>20;
//        System.out.println(one < 100 && one > 20);

//        double one = scanner.nextDouble();
//        double two = scanner.nextDouble();
//        double result = (one * one) + (two * two);
//        System.out.println(result);

//        String str = scanner.nextLine();
//        System.out.println("You just entered " + str);

//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double d = scanner.nextDouble();
//        double e = scanner.nextDouble();
//        double res = (a + b + c + d + e) % a;
//        System.out.println(res > 0 && res > a/2);

//        String word = scanner.nextLine();
//        int first = scanner.nextInt();
//        int second = scanner.nextInt();
//        int sum = first + second;
//        System.out.println(first +" "+ word + " + " + second + " " + word + " = "  + sum +" "+ word);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int three = scanner.nextInt();
        System.out.println(first > second + three || three * three > first + second);

    }

}

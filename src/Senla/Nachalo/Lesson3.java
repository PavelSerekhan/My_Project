package Senla.Nachalo;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//4
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//
//        System.out.println((x > (y + z)) || (Math.sqrt(z) > x + y));
//7
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int C = scanner.nextInt();
//        int D = scanner.nextInt();
//        int E = scanner.nextInt();
//        int F = scanner.nextInt();

//        System.out.println(x > y && y > z && z > a && a > b && b > c && x > 3);
//        int buffer;
//
//        buffer = A;
//        A = F;
//        F = buffer;
//        System.out.println("A = " + A + ", F = " + F);
//
//        buffer = E;
//        E = B;
//        B = buffer;
//
//        buffer = D;
//        D = C;
//        C = buffer;

        // 10

//        System.out.println("Введите число в метрах: ");
//        int metr = scanner.nextInt();
//        double resultKm = 1.0 * metr/1000;
//        System.out.println("Введеное число в метрах равно " + resultKm + "km.");

        System.out.println("Введите расстояние в дюймах(cm): ");
        double duim = scanner.nextDouble() / 10000;
        System.out.println("Введите расстояние в километрах: ");
        double km = scanner.nextDouble() ;
        boolean result = (duim >= km);

        System.out.println(result);

    }
}

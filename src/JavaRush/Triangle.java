package JavaRush;

import java.util.Scanner;

/**
 * Напишем программу, которая будет просчитывать возможность существования треугольника на
 * основе длин его сторон.
 * Для этого тебе нужно:
 * Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
 * Определить возможность существования треугольника по сторонам.
 * Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не
 * существует".
 * Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
 * То есть, тебе нужно выполнить три сравнения:
 * <p>
 * Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами
 * существует.
 * Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух
 * других, то треугольника с такими сторонами не существует.
 */
public class Triangle {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        if ((a < b + c) && (b < c + a && c < a + c)){
//            System.out.println(TRIANGLE_EXISTS);
//        } else {
//            System.out.println(TRIANGLE_NOT_EXISTS);
//        }
//        scanner.close();
        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
        scanner.close();
    }
}

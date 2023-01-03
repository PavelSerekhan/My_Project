package Day1;

import java.util.Scanner;

/**
 * цикл do while гарантирует один проход по циклу
 * тело цикла в цикле do-while выполнятся как минимум один раз.
 */
public class DoWhile {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int value;
//        do {
//            System.out.println("Введи 5");
//            value = scanner.nextInt();
//        } while (value != 5);

//        Scanner scanner = new Scanner(System.in);
//        String s;
//        do {
//            s = scanner.nextLine();
//        } while (!s.equals("exit"));

        /**
         * Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
         * Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно
         * вывести с новой строки.
         * Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно
         * вывести на экран один раз.
         */

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // pavel
        int number = scanner.nextInt(); // 3

        do {
            System.out.println(s); //vyvod pavel
            number--;              // 3-1
        } while (number > 0 && number < 4);

    }
}


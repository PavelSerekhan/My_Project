package Day3;

import java.util.Scanner;

public class Swich_задача {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String city = scanner.nextLine();
//            if (city.equals("Stop")) {
//                break;
//            }
//
//            switch (city) {
//                case "Москва":
//                case "Владивосток":
//                case "Ростов":
//                    System.out.println("Россия");
//                    break;
//                case "Рим":
//                case "Милан":
//                case "Турин":
//                    System.out.println("Италия");
//                    break;
//                case "Ливерпуль":
//                case "Манчестер":
//                case "Лондон":
//                    System.out.println("Англия");
//                    break;
//                case "Берлин":
//                case "Мюнхен":
//                case "Кёльн":
//                    System.out.println("Германия");
//                    break;
//                default:
//                    System.out.println("Неизвестная страна");
//            }
//        }
/**
 * Реализовать программу, которая пока работает, принимает на вход от пользователя два числа -
 * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления и выводит
 * его в консоль. Программа останавливает свою работу тогда, когда пользователь вводит 0 в
 * качестве делителя.
 */
//        Scanner scanner = new Scanner(System.in);
//        while (true) { //break Ключевое слово break прерывает выполнение структур for, while и switch.
//            double a = scanner.nextDouble();
//            double b = scanner.nextDouble();
//
//            if (b == 0)
//                break;
//
//            System.out.println(a / b);
//        }

        /**
         * Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
         * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления и
         * выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо того,
         * чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и выводим в
         * консоль сообщение “Деление на 0”.
          */
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            counter++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue; // пропустить
            }
            System.out.println(a / b);
        }
    }
}

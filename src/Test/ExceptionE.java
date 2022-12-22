package Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionE {

    /**
     * Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
     * Но есть проблема: если в журнале нет студента с нужным номером, программа завершается с исключением ArrayIndexOutOfBoundsException. Оберни одну строку в try-catch, чтобы программа продолжала работать.
     * В блоке catch выведи в консоли сообщение "Студента с таким номером не существует".
     */
//    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
//    public static final String EXIT = "exit";
//    public static final String ANSWERING = "Отвечает ";
//    public static final String NOT_EXIST = "Студента с таким номером не существует";
//    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";
//
//    static List<String> studentsJournal = Arrays.asList(
//            "Тимур Мясной"
//            , "Пенелопа Сиволап"
//            , "Орест Злобин"
//            , "Ирида Продувалова"
//            , "Гектор Гадюкин"
//            , "Электра Чемоданова"
//            , "Гвидон Недумов"
//            , "Роксана Борисенко"
//            , "Юлиан Мумбриков"
//            , "Зигфрид Горемыкин");
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println(PROMPT_STRING);
//
//            String input = scanner.nextLine();
//            if (input.equalsIgnoreCase(EXIT)) {
//                break;
//            }
//
//            int studentId;
//            try {
//                studentId = Integer.parseInt(input);
//                System.out.println(ANSWERING + studentsJournal.get(studentId));
//            } catch (NumberFormatException ex) {
//                System.out.println(INTEGER_REQUIRED);
//            } catch (Exception e) {
//                System.out.println(NOT_EXIST);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        buyElephant(null,scanner);
//    }
//    static void buyElephant(String answer,Scanner scanner){
//        if (answer == null){
//            System.out.println("Купи слона");
//        }else if (answer.toLowerCase().equals("ок")) {
//            System.out.println("Так-то лучше :) Список твоих отговорок:");
//            throw new SecurityException();
//        } else {
//            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
//        }
//        answer = scanner.nextLine();
//
//        try {
//            buyElephant(answer, scanner);
//        }catch (Exception e){
//            System.out.println(answer);
//            throw e;
//        }
//    }

    /**
     * Объедини блоки catch с одинаковым кодом.
     */
    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}



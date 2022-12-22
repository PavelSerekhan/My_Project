package Day1;

import java.util.Scanner;

/**
 * Тело цикла выполняется снова и снова, пока условие равно true
 * Оператор break приводит к немедленному завершению цикла
 */
public class While_While {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 10){
//            System.out.print("JAVA ");
//            i ++;
//        }
//        int i = 0;
//        while (i <= 9){
//            System.out.println("JAVA");
//            i++;
//        }
//        int year = 1980;
//        while (year != 2024){
//            System.out.println("Олимпиада " +  year  + " года");
//            year +=4;
//        }
//        int age = 32;
//        while (age <= 100) {
//            System.out.println("Мой возраст " + age);
//            age += 5;
//        }

//        int n = 5;
//        while (n > 0){
//            System.out.println(n);
//            n --;
//        }

//        int n = 0;
//        while (n < 10){
//            System.out.println(n);
//            n++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int x = scanner.nextInt();
//            System.out.println(x);
//        }

//        Scanner console = new Scanner(System.in);
//        boolean isExit = false;
//        while (!isExit){
//            String s = console.nextLine();
//            isExit = s.equals("exit");
//        }

//        String text = " любит меня.";
//        //напишите тут ваш код
//        Scanner scanner = new Scanner(System.in);
//        int n = 0;
//        String name = scanner.nextLine();
//        while (n < 10) {
//            System.out.println(name + text);
//            n++;
//        }

        /**
         * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать
         * их сумму, пока пользователь не введет слово "ENTER".
         * Вывести на экран полученную сумму и завершить программу.
         */
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        boolean isExit = false;
//        while (!isExit) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                sum += number;
//            } else if (scanner.hasNextLine()) {
//                String str = scanner.nextLine();
//                if (str.equals("ENTER")) {
//                    isExit = true;
//                    break; //break Ключевое слово break прерывает выполнение структур for,
//                    // while и switch.
//                }
//            }
//        }
//        System.out.println(sum);

//        ААААА
//        ААААА
//        ААААА
//        ААААА

//        int n = 0;
//        while (n < 10) {
//
//            int m = 0;
//            while (m < 20) {
//                System.out.print("А");
//                m++;
//                while (n > 0 && n < 9 && m < 19) {
//                    System.out.print(" ");
//                    m++;
//                }
//            }
//            System.out.println();
//            n++;
//        }

//        Scanner console = new Scanner(System.in);
//
//        while (true) {
//            String s = console.nextLine();
//            if (s.equals("exit"))
//                break;
//            System.out.println(s);
//
//        }

//        int i = 0;
//        int sum = 0;
//        while (i < 100) {
//            i++;
//            if (i % 3 == 0)
//                continue;
//            sum+=i;
//        }
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (scanner.hasNextInt()) {
//            int x = scanner.nextInt();
//            sum += x;
//        }
//        System.out.println(sum);

        int min1 = Integer.MAX_VALUE; //самое минимальное
        int min2 = Integer.MAX_VALUE; //второе минимальное > min1
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < min1){
                min2 = min1;
                min1 = number;
            } else {
                if (number > min1 && number < min2) {
                    min2 = number;
                }
            }
        }
        System.out.println(min2);
        scanner.close();
    }
}





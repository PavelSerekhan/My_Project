package Day3;

import java.util.Scanner;

public class Swith_break_continue {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//
//        switch (number){
//            case 10:
//            case 20:
//            case 30:
//                System.out.println("HELLO!");
//                break;
//            default:
//                System.out.println("Bye!");
//        }


        //break Ключевое слово break прерывает выполнение структур for, while и switch.


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(j + " ");
//                if (j == 7)
//                    break;
        //break, вызванный внутри вложенного цикла for прервет выполнение
        // только этого вложенного цикла, а внешний цикл for будет работать.
//            }
//            System.out.println();
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите свой возраст: ");
//        int age = scanner.nextInt();
//        if (age == 10){
//            System.out.println("Ты учишься в школе");
//        } else if (age == 18){
//            System.out.println("Ты закончил школу");
//        }
//        switch (age) { //(age) помещает что должно выполниться
//            case 0:
//                System.out.println("Ты родился");
//                break;// ставиться чтобы след. кейсы не выполнялись
//            case 7:
//                System.out.println("Ты пошкл в шко");
//                break;
//            case 18:
//                System.out.println("ЫТ закорчиылмт");
//                break;
//            default:
//                System.out.println("Eckkjdbz yt ");
//        }

//        String age = scanner.nextLine();
//        switch (age){
//            case "ноль":
//                System.out.println("Ты родился");
//                break;
//        }

        // break выходит мгновенно из цикла
//        int i = 0;
//        while (true) {
//            if (i == 15) {
//                break;// для прерывания цикла!
//            }
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println("Мы вышли из цикла!");

        //continue
        for (int i = 0; i <= 15; i++) {
            if (i % 2 == 0) { //остаток от деления (посмотри на остаток!) для все четных чисел
                continue;// все что стоит после оператора не выполняется
            }
            System.out.println("Это не четное число " + i);
        }
    }
}

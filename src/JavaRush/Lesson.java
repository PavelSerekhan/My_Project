package JavaRush;

import java.util.Scanner;

public class Lesson {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        //напишите тут ваш код

        String result = string1 == string2 ? same : different;
        String result1 = string1== string3 ? same : different;
        String result2 = string2.equals(string3) ? same : different;

        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);


//        int age = 35;
//        if (age >= 18 && age <= 65)
//            System.out.println("Вы можете работать");

//        int age = 35;
//        boolean isYoung = (age < 18);
//        if (!isYoung && age <= 65)
//            System.out.println("Вы можете работать");


//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        boolean isYoung = (age < 20); //true
//        boolean isOld = (age > 60); // true
//        if (isYoung || isOld)      // если true || true
//            System.out.println("можно не работать");
//        sc.close();

//        Scanner scanner = new Scanner(System.in);
//        double numberA = scanner.nextInt();
//        int numberB = scanner.nextInt();
//        // if (numberA > numberB) {
//        //     System.out.println(numberA);
//        // } else {
//        //     System.out.println(numberB);
//        // }
//        System.out.println((numberA > numberB) ? numberA : numberB);
//        scanner.close();

//        String name = "iks";
//        String name1 = name;
//        System.out.println(name == name1);

    }
}

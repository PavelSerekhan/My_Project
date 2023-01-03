package Alishev;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Введите возраст: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Введите рост: ");
//        double height = scanner.nextDouble();
//
//        System.out.printf("Имя: %s, Возраст: %d, Рост: %.2f \n ", name, age, height);
//        scanner.close();

          Person kate = new Person("Kate",32, "Baker Street","+12334567");
          kate.displayName();
         
          kate.displayAge();

          kate.setPhone("80333787840");
          kate.displayPhone();

          Person.displayCounter();
          
       






    }
}


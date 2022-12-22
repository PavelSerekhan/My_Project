package Book;

import java.util.Scanner;

public class Switch_Operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option (1,2,3,4) ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("else 3");
        }
    }
}

package Book.Cycle;

import java.util.Arrays;
import java.util.Scanner;

public class For_Cycle {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Введите число, -1 для выхода: ");
//            n = scanner.nextInt();
//            if (n < 0) continue;
//            sum += n;
//        }
//        scanner.close();

//        int[] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = i;
//        }

        String[] names = new String[10];
        for (int i = 0; i < 10; i++) {
            names[i] = "";
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        for (int a : numbers){
//            System.out.println(a);
//        }
        System.out.println(Arrays.toString(numbers));
    }
}

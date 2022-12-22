package JavaRush;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RIDERY {
    public static void main(String[] args) {
        /**
         * InputStreamReader преобразует байтовые потоки в символьные
         * BufferedReader умеет читать данные не только по одному символ,
         * а еще и целыми строками! Делается это с помощью метода readLine();
         * BufferedReader используется для увеличения производительности, сразу вся инфа
         * копируется в буфеа и от туда берется для использования
         */
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18) {
            if (age >= 6) {
                System.out.println("нужно ходить в школу");
            }
        } else {
            System.out.println("пора в институт");
        }

    }
}



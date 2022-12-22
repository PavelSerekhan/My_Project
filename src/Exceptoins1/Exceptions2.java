package Exceptoins1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Выбрасывание исключений
 */
public class Exceptions2 {
    public static void main(String[] args) throws ScannerExceptions {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
//                try {
//                    throw new IOException(); // сами выбрасываем Excepcion
//                    /**
//                     * можно выбростьб искючение в сигнатуру метода, можно обработать самому
//                     */
//                } catch (IOException e) {
//                    System.out.println("Пользователь ввел что-то кроме 0");
//                }
                throw new ScannerExceptions("Пользователь ввел что-то кроме 0");
            }
        }

    }
}

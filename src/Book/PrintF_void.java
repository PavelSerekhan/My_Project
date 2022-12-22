package Book;

import java.util.Date;

public class PrintF_void {
    public static void main(String[] args) {
        String name = "Pavel";
        int age = 32;
//        System.out.printf("Hello, %s. Next year, you'll be %d", name, age);

        // отформатировать строку без последующего вывода
        String message = String.format("Hello, %s. Next year, you'll be %d", name, age);

        // последовательность форматирования даты и времени начинается с 2 символов
        // и начинается с t !!! далее по таблице символов

        // System.out.printf("%tc", new Date());
        // %1$ задает  форматирование первого аргумента
         System.out.printf("%1$s %2$te %2$tB, %2$tY", "Due date:", new Date());
    }
}


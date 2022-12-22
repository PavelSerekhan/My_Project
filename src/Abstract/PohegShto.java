package Abstract;

import java.io.IOException;
import java.io.PrintStream;

public class PohegShto {
    public static void main(String[] args) throws IOException {

        PrintStream filePrintStream = new PrintStream("e:\\New.txt");

          /*Сохраним текущее значение System.out в отдельную переменную, чтобы потом
       можно было переключиться обратно на вывод в консоль*/
        PrintStream console = System.out;

        // Присваиваем System.out новое значение
        System.setOut(filePrintStream);
        System.out.println("Эта строка будет записана в текстовый файл");

        // Возвращаем System.out старое значение
        System.setOut(console);
        System.out.println("А эта строка - в консоль!");


    }
}

package Abstract;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // сохраняем System.out в свою переменную out
        PrintStream out = System.out;
        // добавляем stream к файлу
        PrintStream ps = new PrintStream("e:\\New.txt");
        // переопределяем System.out, для записи в наш файл вместо консоли
        System.setOut(ps);
        // создаём объект Scanner
        Scanner scanner = new Scanner(System.in);
        // эта строка добавится в файл
        System.out.println(scanner.nextLine());
        // переопределяем System.out обратно
        System.setOut(out);

    }
}

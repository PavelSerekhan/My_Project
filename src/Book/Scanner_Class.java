package Book;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("What is your name?");
//        String name = scanner.nextLine(); // читает строку!
//        String firstName = scanner.next(); // читает только слово!

//        System.out.println("How old are you?");
//        int age = scanner.nextInt();

//        System.out.println("Hello, " + name + ".Next year, you'll be " + (age + 1));
//        scanner.close();

        // для прочтения данных из файла
//        Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);

        // для записи данных в файл
        PrintWriter out = new PrintWriter("e:myfile.txt",StandardCharsets.UTF_8);

    }
}

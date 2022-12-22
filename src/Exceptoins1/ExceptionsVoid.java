package Exceptoins1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsVoid {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в метода main!");
        }

    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("svsv");
        Scanner scanner = new Scanner(file);

    }
}

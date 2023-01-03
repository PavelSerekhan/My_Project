package Abstract;

import java.io.*;

public class FileWritterExample {
    public static void main(String[] args) {
        String outputFileName = "e:/Writer.txt";
        String[] array = {"one", "two", "three", "four"};
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String value : array) {
                writter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

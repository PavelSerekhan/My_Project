package Abstract;

import java.io.*;

public class ConsoleReaderExample {
    public static void main(String[] args) {
        String outputFileName = "e:file.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) {
                    writter.write(line + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

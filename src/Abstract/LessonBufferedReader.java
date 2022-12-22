package Abstract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LessonBufferedReader {
    public static void main(String[] args) {
        String inputFileName = "e:PrintFormat.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

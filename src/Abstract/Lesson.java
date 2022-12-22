package Abstract;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lesson {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("e:data.txt");
        long sum = 0;
        while (input.available() > 0) {
            int data = input.read();
            sum += data;
        }
        input.close();
        System.out.println(sum);
    }
}

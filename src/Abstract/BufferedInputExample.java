package Abstract;

import java.io.*;

public class BufferedInputExample {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("E:/someFile.txt");
            BufferedInputStream buffer = new BufferedInputStream(inputStream);
            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.println("Был прочитан символ " + c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package Abstract;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("E:/someFile1.txt");
        BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream);
        String text = "I love Java";

        byte[] buffer = text.getBytes();
        bufferedStream.write(buffer,0, buffer.length);
        bufferedStream.close();
    }
}

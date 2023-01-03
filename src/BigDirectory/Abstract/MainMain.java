package Abstract;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MainMain {
    public static void main(String[] args) throws IOException {
//        File file = new File("e:/test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("e:/test.txt",true);
        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, " +
                "кто хочет стать программистом!\r\n";
        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();
    }

}



package Abstract;

import java.io.*;

public class LessonBufferReader {
    public static void main(String[] args) throws IOException {
        String greetings = "Привет! Меня зовут Амиго!\nЯ изучаю Java на сайте JavaRush.\n" +
                "Однажды я стану крутым программистом!\n";
        byte[] bytes = greetings.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.setIn(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }

    }
}

package Abstract;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LessonFileReaders {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("e:Reader.txt");
        FileWriter writer = new FileWriter("e:Writer.txt");
        while (reader.ready()){
            int data = reader.read();
            writer.write(data);
        }
        reader.close();
        writer.close();
    }
}

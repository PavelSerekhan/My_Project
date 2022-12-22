package Book2.Stream_;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountLongWords {
    public static void main(String[] args) throws IOException {
        // прочитать текст из файла в символьную строку
        var contents = new String(Files.readAllBytes(Paths.get("e:Alica.txt")));

        //небуквенные символы считаются разделителями (\\PL+)
        List<String> words = List.of(contents.split("\\PL+"));

        long count = 0;

//        for (String w : words) {
//            if (w.length() > 11)  count++;
//        }
//        System.out.println(count);

        // последовательный поток
        count = words.stream().filter(w -> w.length() > 11).count();
        System.out.println(count);

        //параллельный поток
//        count = words.parallelStream().filter(w -> w.length() > 11).count();
//        System.out.println(count);
    }
}

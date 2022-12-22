package Book2.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class ParallelStreams {
    public static void main(String[] args) throws IOException {

        var contents = new String(Files.readAllBytes(Paths.get("E:Alica.txt")));
        List<String> wordList = List.of(contents.split("\\PL+"));

        var shortWords = new int[10];

        wordList.parallelStream().forEach(s-> {
            if (s.length() < 10)
                shortWords[s.length()] ++;
        });
        System.out.println(Arrays.toString(shortWords));

        Arrays.fill(shortWords,0);
        System.out.println(Arrays.toString(shortWords));

        wordList.parallelStream().forEach(s-> {
            if (s.length() < 10)
                shortWords[s.length()] ++;
        });
        System.out.println(Arrays.toString(shortWords));

        Map<Integer,Long> shortWordCounts = wordList
                .parallelStream()
                .filter(s -> s.length() < 10)
                .collect(groupingBy(String::length, counting()));
        System.out.println(shortWordCounts);
    }
}

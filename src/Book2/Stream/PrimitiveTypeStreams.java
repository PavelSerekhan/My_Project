package Book2.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveTypeStreams {
    public static void show(String title, IntStream stream) {

        final int SIZE = 10;
        int[] firstElements = stream
                .limit(SIZE + 1)
                .toArray();
        System.out.println(title + ": ");
        for (int i = 0; i < firstElements.length; i++) {
            if (i > 0) System.out.println(", ");
            if (i < SIZE)
                System.out.println(firstElements[i]);
            else System.out.println(". . .");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        IntStream is1 = IntStream.generate(() -> (int) (Math.random() * 100));
        show("is1: " , is1);

        IntStream is2 = IntStream.range(5,10); //диапазон
        show("is2", is2);

        IntStream is3 = IntStream.rangeClosed(5,10);
        show("is3", is3);

        Path path = Paths.get("e:Alica.txt");
        var contents = new String(Files.readAllBytes(path));
        Stream<String> words = Stream.of(contents.split("\\PL+"));
        IntStream is4 = words.mapToInt(String::length); //перевод слова в int и считаем длину каждого слова
        show("is4", is4);

        var sentence = "\uD835\uDD46 is the set of octonions";
        System.out.println(sentence);

        //возвращает поток всех кодовых точек исходной символьной строки в Юникоде
        IntStream codes = sentence.codePoints();
        System.out.println(codes.mapToObj(c -> String.format("%X ", c))
                .collect(Collectors.joining()));

        Stream<Integer> integers = IntStream.range(0,100).boxed();
        IntStream is5 = integers.mapToInt(Integer::intValue);
        show("is5", is5);
    }
}

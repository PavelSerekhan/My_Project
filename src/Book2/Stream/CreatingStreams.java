package Book2.Stream;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreatingStreams {

    public static <T> void show(String title, Stream<T> stream) {

        final int SIZE = 10;
        List<T> firstElements = stream
                .limit(SIZE + 1)
                .collect(Collectors.toList());
        System.out.println(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.println(", ");
            if (i < SIZE)
                System.out.println(firstElements.get(i));
            else System.out.println(". . .");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        /**
         * различные способы создания потока данных
         */

        Path path = Paths.get("e:Alica.txt");
        var contents = new String(Files.readAllBytes(path));

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words", words);

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);


        Stream<String> silence = Stream.empty(); //пустой поток
        show("silence", silence);

        // бесконечный поток данных, повторный вызов функции
        Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        show("integers", integers);


        Stream<String> wordsAnotherWay = Pattern.compile("\\PL+").splitAsStream(contents);
        show("wordsAnotherWay", wordsAnotherWay);

        // поток данных, элементы которого составляют строки из указанного файла
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }

        Iterable<Path> iterable = FileSystems.getDefault().getRootDirectories();
        Stream<Path> rootDirectories = StreamSupport.stream(iterable.spliterator(),false);
        show("rootDirectories", rootDirectories);

    }
}

package Abstract;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class LessonPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("e:Print Stream.txt");
        printStream.println(222);
        printStream.println("Доброе утро!");
        printStream.println(false);
    }
}

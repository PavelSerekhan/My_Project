package Abstract;

import java.io.IOException;
import java.io.PrintStream;

public class LessonPrintF {
    private static final String GREETINGS_MESSAGE = "My names is %s, my age is %d! \n";

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream("e:PrintFormat.txt");
        printStream.println("Hello");

        printStream.printf(GREETINGS_MESSAGE, "Amigo", 19);
        printStream.printf(GREETINGS_MESSAGE, "Pavel", 32);
        printStream.printf(GREETINGS_MESSAGE, "Viktoria", 10);
        printStream.close();

    }
}

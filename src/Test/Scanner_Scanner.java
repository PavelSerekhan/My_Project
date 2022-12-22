package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_Scanner {
    public static void main(String[] args) throws IOException {
        /**
         * Вот два способа чтения строки с консоли:
         */
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);
        String line = console.nextLine();

        InputStream stream1 = System.in;
        InputStreamReader reader = new InputStreamReader(stream1);
        BufferedReader buff = new BufferedReader(reader);
        String line1 = buff.readLine();

    }
}

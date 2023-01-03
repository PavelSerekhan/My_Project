package Exceptoins1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * multy catch когда в catch много исключений обрабатывается!
 */
public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | IllegalAccessException | ParseException e) { //multy catch
            e.printStackTrace();
        }
    }
    public static void run() throws IOException, ParseException, IllegalAccessException {

    }
}

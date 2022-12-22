package Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MAIN {
    public static void main(String[] args) throws InterruptedException {
        countDown(3);
    }

    public static void countDown(int x) throws InterruptedException {
        if (x <= 0) {
            System.out.println("Boom!");
        } else {
            System.out.println(x);
            countDown(x - 1);
            System.out.println(x);

        }
    }
}

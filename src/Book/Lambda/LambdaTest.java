package Book.Lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};

        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);

        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");

        Arrays.sort(planets, (o1,o2) -> o1.length() - o2.length()); // lambda по длине слова
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println(
                "The times is " + new Date()));
        t.start();
        JOptionPane.showConfirmDialog(null,"Quit program?");
        System.exit(0);

//        repeat(3,() -> System.out.println("Hello, World!"));
//    }
//    public static void repeat(int n, Runnable action) {
//        for (int i = 0; i < n; i++) {
//            action.run();
//        }
    }
}

package Book.Collectionsss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Set не имеет порядка!
 */
public class SetTest {
    public static void main(String[] args) {

        Set<String> worlds = new HashSet<>();
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                worlds.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iter = worlds.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println(". . .");
        System.out.println(worlds.size() + "distinct words. " + totalTime + "milliseconds.");

    }
}

package Book.Comparator_interface;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorMain {
    public static void main(String[] args) {
        Integer[] array = {64, 32, 12, 67, 89, 45, 63, 23};
//        Arrays.sort(array);
//        Arrays.sort(array, Comparator.reverseOrder()); // reverse

            Arrays.sort(array, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

         System.out.println(Arrays.toString(array));
    }
}

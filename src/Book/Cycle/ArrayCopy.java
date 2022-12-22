package Book.Cycle;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] numbers = {1, 33, 55, 88, 99, 32, 98};
//
//        int[] copyNumbers = Arrays.copyOf(numbers,2 * numbers.length);
//        System.out.println(Arrays.toString(copyNumbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

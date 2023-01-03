package Day4;

import java.util.Arrays;
import static Day4.ArrayInverter.invert;

public class ArrayInverterTest {
    public static void main(String[] args) {
        int[] iks = {0, 1, 2, 3, 4, 5, 6};
//        ArrayInverter.invert(iks);
        invert(iks);
        System.out.println(Arrays.toString(iks));
    }
}

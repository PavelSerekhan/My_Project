package JavaRush.Lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadaca {

    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
//        Pair result = getMinimumMaximumPair(data);

    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        int min = inputArray[0];
        int max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min)
                min = inputArray[i];

            if (inputArray[i] > max)
                max = inputArray[i];


        }
        return new Pair(Arrays.stream(inputArray).min().getAsInt(),
                Arrays.stream(inputArray).max().getAsInt());
        // напишите тут ваш код


    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public Integer getY() {
            return y;
        }
    }
}

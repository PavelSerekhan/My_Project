package JavaRush;

import java.util.Arrays;
import java.util.OptionalInt;

public class Africa {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
//        Integer min = 0;
//        for (int i = 0; i < array.length -1; i++) {
//            if (min > array[i])
//                min = array[i];
//        }
//        Integer index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == min){
//                index = i;
//            }
//        }
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        //напишите тут ваш код

        return new Pair<Integer, Integer>(array[index], index);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
    
}

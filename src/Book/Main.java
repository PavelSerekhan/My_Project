package Book;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.2;
//        System.out.println(currencyFormatter.format(x));
//        System.out.println(percentFormatter.format(x));

        int[] array = {3, 6, 47, 9, 6, 326, 6, 5, 1};
        Pair p = ArrayAlgs.minMax(array);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());


//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int a : array){
//            if (min > a)
//                min = a;
//            if (max < a)
//                max = a;
//        }
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);

        /**
         * но если делать это через метод то он должен возвращать 2 значения!!!
         * лучше создать класс для хранения 2 значений!
         */
    }
}

class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

class ArrayAlgs {

    public static Pair minMax(int[] values) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a : values) {
            if (min > a)
                min = a;
            if (max < a)
                max = a;
        }
        return new Pair(min, max);
    }
}

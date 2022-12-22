package Book.StaticInnerClass;

public class PairTest1 {
    public static void main(String[] args) {

        String[] worlds = {"had", "a", "mary", "little", "lamb","jj"};
        Pair2<String> mm = ArrayAlg2.minMax(worlds);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());

        Integer[] numers = {1, 2, 3, 4, 5, 6};
        Pair2<Integer> nnn = ArrayAlg2.minMax(numers);
//        System.out.println("min = " + nnn.getFirst());
//        System.out.println("max = " + nnn.getSecond());

        String n2 = ArrayAlg2.min(worlds);
        System.out.println(n2);
    }

    static class ArrayAlg2 {
        /**
         * Получает символьные строки с минимальным и максимальным значениями
         * среди элементов массива
         *
         * @param a Массив символьных строк
         * @return Пара минимального и максимального значений или пустое значение, если
         * параметр a имеет пустое значение
         */
        public static Pair2<String> minMax(String[] a) {

            if (a == null || a.length == 0) return null;
            String min = a[0];
            String max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (min.compareTo(a[i]) > 0) min = a[i];
                if (max.compareTo(a[i]) < 0) max = a[i];
            }
            return new Pair2<>(min, max);
        }

        public static Pair2<Integer> minMax(Integer[] a) {

            if (a == null || a.length == 0) return null;
            int min = a[0];
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (min > a[i]) min = a[i];
                if (max < a[i]) max = a[i];
            }
            return new Pair2<>(min, max);
        }

        // ограничение на переменную типа T, потому что она может относиться к произвольному классу
        // вдруг у того класса нету метода compareTO!! поэтому и ограничения!
        public static <T extends Comparable> T min(T[] a) {
            if (a == null || a.length == 0) return null;
            T smallest = a[0];
            for (int i = 1; i < a.length; i++) {
                if (smallest.compareTo(a[i]) > 0) smallest = a[i];
            }
            return smallest;
        }
    }
}

class Pair2<T> {

    private T first;
    private T second;

    public Pair2() {
        first = null;
        second = null;
    }

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

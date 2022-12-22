package JavaRush;

import java.util.Arrays;

public class MetodsFunkcii {
//    public static void main(String[] args) {
//    printWiFi();
//    printWiFi();
//    printWiFi();
//    }
//    public static void printWiFi(){
//        System.out.println("Wi - Fi");
//    }

//    public static void main(String[] args) {
//        printWiFi10Times();
//    }
//
//    public static void printWiFi10Times() {
//        for (int i = 0; i < 10; i++) {
//        printWiFi();
//        }
//    }
//
//    public static void printWiFi() {
//        System.out.println("Wi-FI");
//    }

//    public static void printLines(String text, int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println(text);
//        }
//    }
//
//    public static void main(String[] args) {
//        printLines("Hello",10);
//        printLines("Byi", 10);
//    }

//    public static void main(String[] args) {
//    int[] mouths = {31, 28, 31, 30, 31, 30, 31, 31, 30};
//    printArraySum(mouths);
//    }
//    public static void printArraySum(int[] data){
//        int sum = 0;
//        for (int i = 0; i < data.length; i++) {
//            sum += data[i];
//        }
//        System.out.println(sum);
//    }

//    public static void fill(int[][] data, int value){
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[i].length; j++) {
//                data[i][j] = value;
//            }
//            Arrays.fill(data[i], value);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] mouths = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
//        fill(mouths,8);
//    }

    /**
     * Напишем утилиту для работы с массивами. Основная часть функционала готова:
     * метод printArray() выводит в консоли все элементы массива.
     * Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок
     * элементов массива на обратный.
     * Метод должен работать только с массивами целочисленных значений (int[]).
     */
//    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//    }
//
//    public static void reverseArray(int[] array) {
//    //напишите тут ваш код
//        for (int i = 0; i < array.length/2; i++) {
//            int a = array[i];
//            array[i] = array[array.length - i -1];
//            array[array.length - i -1] = a;
//        }
////        int[] array2 = Arrays.copyOf(array, array.length);
////        for (int i = 0; i < array2.length; i++) {
////            array[i] = array2[array2.length - i - 1];
////        }
//
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array){
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }

//    public static void fill(int[] data, int from, int to, int value) {
//        if (from < 0 || to > data.length)
//            return;
//        for (int i = from; i < to; i++) {
//            data[i] = value;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
////        fill(months,2,10,8);
////        printArray(months);
//        singIn("user");
//    }
//    public static void printArray(int[] array) {
//        for (int a : array) {
//            System.out.print(a + " ");
//        }
//    }
//    public static void singIn(String username) {
//        if (username.equals("user"))
//            return;
//        System.out.println("Добро пожаловать " + username);
//        System.out.println("Очень скучали по Вам, " + username);
//    }


//    public static void main(String[] args) {
//        System.out.println(ninthDegree(3));
//    }
//    public static long cube(long a){
//        return a*a*a;
//    }
//    public static long ninthDegree(long a){
//        return cube(cube(a));
//    }

//    public static void main(String[] args) {
//        int[] array = {15,64,9,51,42};
//        printSqrt(array);
//    }
//
//    public static void printSqrt(int[] array) {
//        String elementSqrt = "Корень квадратный для числа ";
//        for (int i = 0; i < array.length; i++) {
//            int element = array[i];
//            double elementSqrt1 = Math.sqrt(element);
//            System.out.println(elementSqrt + element + " равен " + elementSqrt1);
//        }
//    }

//    public static byte a;
//    public static short b;
//    public static int c;
//    public static long d;
//
//    public static void main(String[] args) {
//        setValues(100);
//    }
//
//    public static void setValues(long value){
//        //напишите тут ваш код
//       a = (byte) value;
//       b = (short) value;
//       c = (int) value;
//       d = value;
//    }
//    public static void main(String[] args) {
//        String[] data = new String[10];
//        fill(data, "Hello");
//    }
//
//    private static void fill(String[] array, String value) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = value;
//        }
//    }
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }
    private static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end ; i++) {
            array[i] = value;

        }
    }

}




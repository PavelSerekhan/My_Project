package Day4;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Aray_ForEach {
//    public static void main(String[] args) {
//        int[][] numbers = {{1, 2, 3},
//                           {4, 4, 5},
//                           {7, 8, 9}};
//        for (int i = 0; i < numbers.length; i++) { //внешний цикл проходит по колонкам
//            for (int j = 0; j < numbers[i].length; j++) { //внутренний проходит по строкам
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        int[] mice = {2, 8, 10, 12, 18};
//        int count = 0;
//        for (int num : mice) {
//            System.out.print(num + " ");
//        }
//        for (int i = 0; i < mice.length; i++) {
//            count = count + mice[i];
//        }
//        System.out.println(count);
//        System.out.println(count/mice.length);
//        }

    /**
     * Поиск элементов строкового массива по начальным символам
     */
//    public static void main(String[] args) {
//        final String[] catNamesArray = new String[]{"Рыжик", "Барсик", "Мурзик",
//                "Мурка", "Васька", "Томасина", "Бобик", "Кристина", "Пушок",
//                "Дымка", "Кузя", "Китти", "Барбос", "Масяня", "Симба"};
//
//        List<String> words = searchFromStart(catNamesArray,"мур");
//        for (String www: words){
//            System.out.println(www);
//        }
//    }
//    public static ArrayList<String> searchFromStart(String[] inputArray, String searchText) {
//        ArrayList<String> outputArray = new ArrayList<>();
//
//        for (int i = 0; i < inputArray.length; i++) {
//            if (searchText.compareToIgnoreCase(inputArray[i].substring(0,
//                    searchText.length())) == 0) {
//                outputArray.add(inputArray[i]);
//            }
//        }
//        return outputArray;


//    public static void main(String[] args) {
//        int[] anyNumbers = {2, 4, 7};
//        int[] luckyNumbers = Arrays.copyOf(anyNumbers, anyNumbers.length);
//        luckyNumbers[2] = 23;
//        System.out.println("anyNumbers: " + Arrays.toString(anyNumbers) + " luckyNumbers: "
//         + Arrays.toString(luckyNumbers));
//
//    }

    /**
     * Имеется массив из четырёх чисел int[] numbers = {3, 9, 11, 15};.
     * Поменяйте местами первый и второй элемент массива.
     */
//    public static void main(String[] args) {
//        int[] numbers = {3, 9, 11, 15};
//        numbers[1] = numbers[0];
//        numbers[0] = 9;
//        System.out.println(Arrays.toString(numbers));
//    }
    /**
     * Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
     */
//    public static void main(String[] args) {
//        int a = 0;
//        for (int i = 2; i <= 30 ; i++) {
//            if (i % 2 == 0)
//                a++;
//        }
//        int[] iks = new int[a];
//        for (int i = 2, b = 0; i <= 30; i++) {
//            if (i % 2 == 0){
//                iks[b] = i;
//                System.out.print(iks[b] + " ");
//                b++;
//            }
//        }
//        System.out.println();
//        System.out.println(iks.length);
//    }

    /**
     * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке
     * (99 97 95 93 … 7 5 3 1).
     */
//    public static void main(String[] args) {
//        int a = 0;
//        for (int i = 1; i <= 99; i++) {
//            if (i % 2 != 0){
//                a++;
//            }
//        }
//        int[] array = new int[a];
//        for (int i = 0, b = 0; i <= 99; i++) {
//            if (i % 2 != 0){
//                array[b] = i;
//                System.out.print(array[b] + " ");
//                b++;
//            }
//        }
////        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length/2; i++) {
//            int tmp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = tmp;
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(array));

    /**
     * массив в обратном порядке
     */
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        invert(array);
//        System.out.print(Arrays.toString(array));
//    }
//
//    public static int[] invert(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int a = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = a;
//        }
//        return array;
//    }

    /**
     * Найти максимальное значение из массива
     */
//    public static void main(String[] args) {
//        int[] mice = new int[]{4, 9, 3, 22, 5, 18, 25, 7, 11, 15, 5, 19};
//        getMax(mice);
//        getMin(mice);
//
//    }
//
//    public static void getMax(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[0]) {
//                array[0] = array[i];
//            }
//
//        }
//        System.out.println(array[0]);
//
//    }
//    public static void getMin(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[0]) {
//                array[0] = array[i];
//            }
//        }
//        System.out.println(array[0]);
//    }

//    public static void main(String[] args) {
//        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74};
//        System.out.println(min(array));
//
//    }
//    private static int min(int[] array){
//        int minIndex = 0;
//        int minValue = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] < minValue){
//                minValue = array[i];
//                minIndex = i;
//            }
//        }
//        return minValue;

//    public static int[] array = new int[]{-1, 2, 3, -4, -5};
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] % 2 != 0){
//                array[i] *= -1;
//            }
//        }
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);


    /**
     * Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
     * Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
     * Программа должна правильно обрабатывать массивы любой длины.
     */
//    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//    public static int[] resultArray;

//    public static void main(String[] args) {
    //напишите тут ваш код

//        resultArray = new int[firstArray.length + secondArray.length];
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] = firstArray[i];
//        }
//        for (int i = 0; i < secondArray.length; i++) {
//            resultArray[resultArray.length/2 + i] = secondArray[i];
//        }
//
//        System.arraycopy(firstArray, 0, resultArray, 0, 10);
//        System.arraycopy(secondArray, 0, resultArray, 10, 10);

//        resultArray[10] = secondArray[0];
//        resultArray[11] = secondArray[1];
//        resultArray[12] = secondArray[2];
//        resultArray[13] = secondArray[3];
//        resultArray[14] = secondArray[4];
//        resultArray[15] = secondArray[5];
//        resultArray[16] = secondArray[6];
//        resultArray[17] = secondArray[7];
//        resultArray[18] = secondArray[8];
//        resultArray[19] = secondArray[9];

//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + ", ");
//        }
//    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        for (int a : arr){
//            System.out.println(a);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(i);
//        }

    /**
     * Тебе нужно написать программу, которая:
     * <p>
     * Считывает с консоли целое число N.
     * Если считанное число N больше 0, то программа дальше считывает целые числа,
     * количество которых равно N.
     * Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе —
     * в обратном порядке.
     * Каждое число выводить с новой строки. Число N выводить не нужно.
     */
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (N > 0) {
//            int[] array = new int[N];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = scanner.nextInt();
//            }
//            if (N % 2 != 0) {
//                for (int i = 0; i < array.length; i++) {
//                    System.out.println(array[i]);
//                }
//            } else {
//                for (int i = array.length - 1; i >= 0; i--) {
//                    System.out.println(array[i]);
//                }
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int N = Integer.parseInt(scanner.nextLine());
//
//        int[] array;
//        array = new int[N];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i] ){
//                max = array[i];
//            }
//        }
//        System.out.println(max);

//    public static String[] strings;
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//
//        Scanner scanner = new Scanner(System.in);
//
//        strings = new String[6];
//        for (int i = 0; i < 6; i++) {
//            strings[i] = scanner.nextLine();
//
//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[i] == null) {
//                    break;
//                }
//                if (strings[i].equals(strings[j])) {
//                    strings[i] = null;
//                    strings[j] = null;
//
//                }
//            }
//        }
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//        }

//    public static int[][] MULTIPLICATION_TABLE;
//
//    public static void main(String[] args) {
///**
// * Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его
// * таблицей умножения и выведи в консоли
// */
//        MULTIPLICATION_TABLE = new int[10][10];
//        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
//            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
//
//                MULTIPLICATION_TABLE[i][j] = (i+1)*(j+1);
//                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
//            }
//            System.out.println();
//        }

    /**
     * Создай треугольный массив, где значение каждого элемента — это сумма его индексов.
     */
//    public static int[][] result = new int[10][];
//
//    public static void main(String[] args) {
//        for (int i = 0; i < result.length; i++) {
//            result[i] = new int[i + 1];
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = i + j;
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//        result[0] = new int[]{0};
//        result[1] = new int[]{1, 2};
//        result[2] = new int[]{2, 3, 4};
//        result[3] = new int[]{3, 4, 5, 6};
//        result[4] = new int[]{4, 5, 6, 7, 8};
//        result[5] = new int[]{5, 6, 7, 8, 9, 10};
//        result[6] = new int[]{6, 7, 8, 9, 10, 11, 12};
//        result[7] = new int[]{7, 8, 9, 10, 11, 12, 13, 14};
//        result[8] = new int[]{8, 9, 10, 11, 12, 13, 14, 15, 16};
//        result[9] = new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17,18};
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//        }
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result.length; j++) {
//                result[i] = i + j;
//
//            }
//
//        }
//    public static void main(String[] args) {
//        int[][] matrix = new int[3][];
//        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
//        matrix[1] = new int[]{1, 2, 3};
//        matrix[2] = new int[]{1};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    /**
     * Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на
     * некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество
     * строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем
     * создавать такой массив.
     * <p>
     * Для этого реализуй метод main(String[]),
     * Считывает из консоли число N — количество строк массива (считай, что это число будет
     * больше 0, можно не проверять).
     * Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
     * Инициализирует двумерный массив multiArray:
     * количеством строк N;
     * строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке
     * ввода).
     */

//    public static int[][] multiArray;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        multiArray = new int[n][];
//        for (int i = 0; i < n; i++) {
//            int size = scanner.nextInt();
//            multiArray[i] = new int[size];
//
//        }
//    }

//        int one = scanner.nextInt();
//        int two;
//        if (one > 0){
//            multiArray = new int[one][];
//            for (int i = 0; i < one; i++) {
//                two = scanner.nextInt();
//                multiArray[i] = new int[two];
//            }
//        }
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                multiArray[i][j] = i + 1;
//                System.out.print("[]");
//            }
//            System.out.println();
//        }
//    }
//    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}},
//            {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(multiArray));
//    }

//    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
//    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(strings));
//        System.out.println(Arrays.deepToString(ints));
//    }

//    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//
//    public static void main(String[] args) {
//
//        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));

//    public static void main(String[] args) {
//        int[] x = new int[10];
//        Arrays.fill(x,2,7,12);
//        System.out.println(Arrays.toString(x));
//    }

    /**
     * Реализуй статический метод main(String[]), который заполняет массив array значениями
     * valueStart и valueEnd.
     * Если длина массива четная, его первую половину нужно заполнить значениями valueStart,
     * а вторую — valueEnd. Если длина массива нечётная, то первую большую часть заполнить
     * значениями valueStart, вторую меньшую — valueEnd.
     * Для заполнения массива используй
     * метод Arrays.fill(int[], int, int, int).
     */

//    public static int[] array = new int[12];
//    public static int valueStart = 10;
//    public static int valueEnd = 13;
//
//    public static void main(String[] args) {
//        if (array.length % 2 == 0){
//            Arrays.fill(array,0,array.length/2,valueStart);
//            Arrays.fill(array,array.length/2 ,array.length,valueEnd);
//        } else {
//            Arrays.fill(array,0,array.length/2 + 1,valueStart);
//            Arrays.fill(array,array.length/2 + 1,array.length,valueEnd);
//        }
//        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//        Arrays.fill(array, 0, firstPart, valueStart);
//        Arrays.fill(array, firstPart, array.length, valueEnd);
//        System.out.println(Arrays.toString(array));
//
//        //напишите тут ваш код
//        System.out.println(Arrays.toString(array));


//    public static void main(String[] args) {
//        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
//        System.out.println(Arrays.toString(copyNumbers));
//    }


    /**
     * Реализуй метод main(String[]), который делит массив array на два подмассива и
     * заполняет ими двумерный массив result.
     * Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
     * Для разделения массива используй метод Arrays.copyOfRange(int[], int, int).
     * Порядок элементов не меняй.
     * При тестировании значения полей класса Solution будут разными, учти это.
     */
//    public static int[][] result = new int[2][];
//    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//    public static void main(String[] args) {
//        int lon = array.length %2 != 0 ? array.length/2 + 1 : array.length/2;
//        int[] copyArray = Arrays.copyOfRange(array, 0, lon);
//        int[] copyArray2 = Arrays.copyOfRange(array, lon, array.length);
//        result = new int[2][];
//        for (int i = 0; i < result.length; i++) {
//            result[0] = Arrays.copyOf(copyArray,lon);
//            result[1] = Arrays.copyOf(copyArray2,copyArray2.length);
//        }
//        // напишите тут ваш код
//        System.out.println(Arrays.deepToString(result));
//    }

    /**
     * Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится
     * в переданном массиве, иначе — false.
     * Массив array не должен изменять расположение своих элементов.
     *
     * Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй
     * статический метод Arrays.binarySearch(int[], int) класса Arrays.
     * Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
     * вторым параметром — искомый элемент.
     * Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента,
     * если такой элемент есть в массиве.
     *
     * Для сортировки массива можно использовать метод Arrays.sort(int[]).
     */

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        int index = Arrays.binarySearch(copyArray, element);
        System.out.println(index >= 0);
    }
}
















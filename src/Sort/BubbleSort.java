package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Сортировка пузырьком (глупая сортировка) - идем вдоль массива, сравнивая 2 соседних элемента,
 * если они не в правильном порядке, то меняем местами! При первом проходе "выплывет" самый
 * большой элемент. Повторяй первый шаг, если был совершен обмен на предыдущем шаге.
 * Неэффективная!
 */
public class BubbleSort {

//    public static void main(String[] args) {
//        int[] array = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array));
//        for (int j = 0; j < array.length; j++) {
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] < array[i - 1]) {
//                    int tmp = array[i];
//                    array[i] = array[i - 1];
//                    array[i - 1] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = {10, 2, 10, 3, 1, 2, 5};
//        System.out.println(Arrays.toString(array));
//
//        boolean needIteration = true;
//
//        while (needIteration){
//            needIteration = false;
//
//            for (int i = 1; i < array.length; i++) {
//                if (array[i] < array[i - 1]) {
//                    int tmp = array[i];
//                    array[i] = array[i - 1];
//                    array[i - 1] = tmp;
//
//                    needIteration = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }


    public static ArrayList<Integer> numbers = new ArrayList<>();


    public static void main(String[] args) {
        Collections.addAll(numbers, 45, 89, 1, 45, 13, 4, 69, 11, -89);

        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    }
    public static void sort() {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

}

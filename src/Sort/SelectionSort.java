package Sort;

import java.util.Arrays;

/**
 * Сортировка выбором - (1)находим минимальное значение, меняем местами это значение с первым
 * неотсортированным значением, ставя его в конец отсортированного массива.
 * На первом шаге все значения не отсортированы!
 * Если остались неотсортированные значения, возвращаемся к шагу 1.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32};
        for (int step = 0; step < array.length; step++) {
            int index = min(array,step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length ; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
                    minIndex = i;
                }
        }
        return minIndex;
    }
}

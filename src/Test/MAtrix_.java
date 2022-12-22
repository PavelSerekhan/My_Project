package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MAtrix_ {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        reverse(arr);
//        for (int item : arr) {
//            System.out.println(item);
//        }
        System.out.println(Arrays.toString(reverse(arr)));

    }

    public static Integer[] reverse(Integer[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

//перевернуть массив через коллекцию
//    public static Integer[] reverse(Integer[] arr) {
//        List<Integer> list = Arrays.asList(arr);
//        Collections.reverse(list);
//        return list.toArray(arr);
//    }
}

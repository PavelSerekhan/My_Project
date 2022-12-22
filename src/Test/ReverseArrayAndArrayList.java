package Test;

import java.util.ArrayList;

public class ReverseArrayAndArrayList {

    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);              //возвращает номер под индексом i
            numbers.set(i, numbers.get(n - 1));    //меняем значение элемента с номером i, на n-1
            numbers.set(n - i, temp);

        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}



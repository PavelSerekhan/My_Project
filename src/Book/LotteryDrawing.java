package Book;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько чисел нужно нарисовать?");
        int k = scanner.nextInt();
        System.out.println("какое максимальное число вы можете нарисовать");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {

            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("поставьте следующую комбинацию. это сделает тебя богатым");
        for (int r : result){
            System.out.print(r + " ");
        }
    }
}

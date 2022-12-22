package JavaRush.Stream_.JavaRushStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaVyrazeniya {
    public static void main(String[] args) {
//         Старый способ:
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        for (Integer lists : list){
//            System.out.println(lists);
//        }
        // Новый способ:
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        list.forEach(n -> System.out.print(n + " "));
//        list.forEach(System.out::println);

//        Старый способ:
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        for (Integer n : list){
//            int x = n * n;
//            System.out.println(x);
//        }
        // Новый способ:
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        list.stream().map((x) -> x * x).forEach(System.out::println);
// преобразовываем список в поток, затем передаем выражение в метод мап, который применяет его ко всем элементам в потоке

        // Старый способ:
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        int sum = 0;
//        for (Integer n : list){
//            int x = n * n;
//            sum += x;
//        }
//        System.out.println(sum);

        // Новый способ:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = list.stream().map((x) -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum);
// используем метод map() для возведения в квадрат каждого элемента, а потом применяем
// метод reduce() для свертки всех элементов в одно число.
    }
}

package Lessom_1_Level_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Home {
    public static void main(String[] args) {
//        int[] a = {3,5,8,4,2,7,0};
//        Arrays.sort(a);
//        for (int s : a ){
//            System.out.println(s);
//        }

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Pavel", "Diana", "Vika","Alex");
//        Collections.sort(list);
//        System.out.println(list );
//        Collections.reverse(list);
//        System.out.println(list );

//        int a = Integer.MAX_VALUE;
////        System.out.println(a);
//        byte b = Byte.MIN_VALUE;
//        System.out.println(b);


        Integer number = 17;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number);
        System.out.println(convert);
    }

}

package Test;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Co {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        Collections.addAll(newList, 7, 8, 6, 8, 6, 1, 2, 3);

        Collections.swap(newList,newList.indexOf(7),newList.indexOf(3));
        System.out.println(newList);

        Collections.addAll(list, 6, 4, 7, 53, 2);
//        System.out.println(list);

        Collections.sort(list);
//        System.out.println(list);

        Collections.fill(list, 3);
//        System.out.println(list);

        Collections.replaceAll(list, 3, 6);
//        System.out.println(list);

        Collections.copy(newList, list);
//        System.out.println(newList);

        Collections.reverse(newList);
//        System.out.println(newList);

        Collections.shuffle(newList);
//        System.out.println(newList);

        int search = Collections.binarySearch(list,6);
//        System.out.println(search);

        int count = Collections.frequency(list,6);
//        System.out.println(count);
    }
}

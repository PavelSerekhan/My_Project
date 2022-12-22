package Book.Collectionsss;

import com.company.Linked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyIterator {
    public static void main(String[] args) {
        Integer[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42};

//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, array);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        || если писать forEach то создается iterator автоматически
        for(Integer integer : list){
            System.out.println(integer);
        }
    }
}

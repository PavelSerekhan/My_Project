package Book.Collectionsss;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * быстрое удаление (удаление за константное время)
 */
public class MyDelete {
    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();

        // ListIterator более продвинутый чем просто iterator

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item >= 128){
                iterator.remove();
            }
        }
    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add((int) Math.random() * 256);
        }
        return list;
    }
}

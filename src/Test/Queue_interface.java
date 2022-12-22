package Test;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_interface {
    public static void main(String[] args) {
        /*
        first in -> first out
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()){
            System.out.println(queue.poll()); // poll метод для вывода элемента!
            // возвращает с удалением элемент из начала очереди
        }
    }
}

package Test;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_interface {
    public static void main(String[] args) {
        /*
        First in -> Last Out
        Stack класс - уставевший
         */
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()){
            System.out.println(stack.pop()); // вывод будет с конца
        }
    }
}

package Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * В Java даже есть специальная коллекция с таким поведением и таким же названием — Stack.
 * Этот класс в своем поведении очень похож на ArrayList и LinkedList.
 * Однако у него есть еще методы, которые реализуют поведение стека:
 * boolean empty() - Проверяет, не пуста ли коллекция
 * int search(Object obj) - Ищет объект из коллекции, возвращает его index
 */
public class Stack_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);       //Добавляет элемент obj в конец списка (наверх стопки)
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        int x = stack.pop();      //Забирает элемент с верха стопки (высота стопки уменьшается)
        System.out.println(stack);

        int y = stack.peek();
        System.out.println(y);//Возвращает элемент с верха стопки (стопка не меняется)
        stack.pop();
        stack.pop();

        //stack.forEach(s -> System.out.println(s));
        stack.forEach(System.out::println);
    }

    /**
     * В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе списка.
     * Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы класса MyStack.
     * Где метод push(String) добавляет элемент в начало списка storage.
     * Метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка.
     * Метод peek() возвращает первый элемент списка storage.
     * Метод empty() проверяет, не пустой ли список storage.
     * Метод search(String) ищет элемент в списке storage и возвращает его индекс.
     * Если элемента нет в списке — возвращает -1.
     */

//    private final List<String> storage = new LinkedList<>();
//
//    public void push(String s) {
//        //напишите тут ваш код
//            storage.add(0,s);
//        }
//    public String pop() {
//        //напишите тут ваш код
//        return storage.remove(0);
//    }
//
//    public String peek() {
//        //напишите тут ваш код
//        return storage.get(0);
//    }
//
//    public boolean empty() {
//        //напишите тут ваш код
//        return storage.isEmpty();
//    }
//
//    public int search(String s) {
//        //напишите тут ваш код
//        return storage.indexOf(s);
//    }
}

package Book;

import Book.ObjectClass.Employee2;

import java.util.ArrayList;

/**
 * Вставка и удаление элемента списочного массива не особенно эффективна! Если большой массив,
 * то лучше LinkedList
 */
public class ArrayList_Class {
    public static void main(String[] args) {
        ArrayList<String> staff = new ArrayList<>(100);// установка кол-ва значений
        staff.ensureCapacity(100);// сразу знаем на сколько будет список элементов
        staff.trimToSize(); // обрезка списка массива до текущего его размера
        staff.add("Pavel");
        staff.set(0,"Polina");  // array[1] = "Pavel";
        // для заполнения массива применяется метод add, а set для замены ранее введенного элемента
        staff.add(0,"Vika");
        staff.remove(1); // удаление по индексу
        System.out.println(staff);
//        System.out.println(staff.get(0));



        // EqualsTest in ArrayList
//        ArrayList<Employee2> staff = new ArrayList<>();
//        staff.add(new Employee2("Carl Cracker", 75000, 1987,12,15));
//        staff.add(new Employee2("Harry Hacker", 50000,1989,11,23));
//        staff.add(new Employee2("Tony Tester", 40000,1990,3,15));
//        //поднять всем работникам зп на 5%
//        for (Employee2 p : staff){
//            p.raiseSalary(5);
//        }
//        for (Employee2 p : staff){
//            System.out.println("name = " + p.getName() + ", salary = " + p.getSalary()
//            + ", hireDay = " + p.getHireDay());
//        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(3)); // list.add(3)  // автоупаковка
        int n = list.get(0).intValue(); //list.get(0) // распаковка
    }
}

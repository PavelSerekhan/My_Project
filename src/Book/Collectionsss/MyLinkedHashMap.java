package Book.Collectionsss;


import java.util.Iterator;
import java.util.LinkedHashMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {

        var staff = new LinkedHashMap<String, Employee>();

        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Franceska Cruz"));

//        staff.forEach((k,v) -> System.out.println("key = " + k + ", value = " + v ));
        Iterator<String> iterator = staff.keySet().iterator();
        iterator.forEachRemaining(System.out::println); //Remaining пока все элементы не выведет

        System.out.println();
        Iterator<Employee> iterator1 = staff.values().iterator();
        iterator1.forEachRemaining(System.out::println);
    }
}



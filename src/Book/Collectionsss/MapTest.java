package Book.Collectionsss;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        var staff = new HashMap<String, Employee>();

        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Franceska Cruz"));

        //вывести все значения на экран
//        System.out.println(staff);

        // удалить значение, удаление элемента по ключу!!!
        staff.remove("567-24-2546");

        //заменить элемент
        staff.put("456-62-5527", new Employee("Franceska Miller"));

//        System.out.println("Search: ");
        // найти значение
//        System.out.println(staff.get("157-62-7935"));


        // перебрать все элементы
        staff.forEach((k,v) -> System.out.println("key = " + k + ", value = " + v));
//        ||
//        for(Map.Entry<String,Employee> entry : staff.entrySet()) {
//            String key = entry.getKey();
//            Employee value = entry.getValue();
//            System.out.println("key = " + key + ", value = " + value);
//        }
//        ||
//        for (var entry : staff.entrySet()) {
//            String key = entry.getKey();
//            Employee value = entry.getValue();
//            System.out.println("key = " + key + ", value = " + value);
//        }

    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

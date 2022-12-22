package Book;

import java.time.LocalDate;

public class EmployeeTest {
//     public static void main(String[] args) {
//         //заполним массив тремя объектами Employee
//        Employee[] staff = new Employee[3];
//        staff[0] = new Employee("Carl Cracker", 75000,1987,12,15);
//        staff[1] = new Employee("Harry Hacker", 50000,1989,10,1);
//        staff[2] = new Employee("Tony Tester", 40000,1990,3,15);
//
//        // поднять всем работникам зарплату на 5%
//         for (Employee e : staff)
//             e.raiseSalary(5);
//         // вывести данные обо всех объектах типа Employee
//         for (Employee e : staff)
//             System.out.println("name " + e.getName() + ", salary " + e.getSalary() +
//                     ", hireDay " + e.getHireDay());
//     }
// }
// class Employee{
//
//    private String name;
//    private double salary;
//    private LocalDate hireDay;
//
//    public Employee(String name, double salary, int year, int month, int day) {
//        this.name = name;
//        this.salary = salary;
//        this.hireDay = LocalDate.of(year,month,day);
//    }
//
//     public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public LocalDate getHireDay() {
//        return hireDay;
//    }
//    public void raiseSalary(double byPercent){
//        double raise = salary * byPercent / 100;
//        salary += raise;
//    }

    public static void main(String[] args) {
//         var e = new Employee("Harry",50000);
//         System.out.println(e.getName() + " " + e.getSalaty());
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 35000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + " ,id = " + e.getId() +
                    " ,salary = " + e.getSalaty());
        }
    }
}

class Employee {

    private static int nextId;

    private String name;
    private double salaty;
    private int id;

    public Employee(String name, double salaty) {
        this.name = name;
        this.salaty = salaty;
        this.id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalaty() {
        return salaty;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }
}

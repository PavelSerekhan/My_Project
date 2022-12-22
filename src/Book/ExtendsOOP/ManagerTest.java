package Book.ExtendsOOP;

public class ManagerTest {
    public static void main(String[] args) {
        //построение объекта типа менеджер
        Manager boss = new Manager("Pavel S", 80000, 1987, 12, 15);
        boss.setBonus(5000);
//
//        // заполнение массива объектами типа Manager и Employee
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
//
//        for (Employee e : staff) {
//            System.out.println("name = " + e.getName() + " ,salary = " + e.getSalary());
//        }
        if (boss instanceof Employee) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



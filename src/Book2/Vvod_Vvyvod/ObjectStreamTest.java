package Book2.Vvod_Vvyvod;

import Book.ExtendsOOP.Employee;
import Book.ExtendsOOP.Manager;

import java.io.*;

/**
 * Сериализация - запись любого объекта в поток ввода - вывода.
 * Десериализация - чтение этого объекта.
 */
public class ObjectStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // для того, что бы сохранить объекты любого класса, нужно, что бы те классы
        // реализовывали интерфейс implements Serializable

        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        carl.setSecretary(harry);

        Manager tony = new Manager("Pavel Tester", 40000, 1990, 3, 15);
        tony.setSecretary(harry);

        Employee[] staff = new Employee[3];
        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;

        // чтобы сохранить записи обо всех работниках в файле employee.dat
        try (ObjectOutputStream out = new ObjectOutputStream
                (new FileOutputStream("e:Employee.dat"))) {
            out.writeObject(staff);// для сохранения объекта
        }

        // для чтения данных объекта
        try(ObjectInputStream in = new ObjectInputStream
                (new FileInputStream("e:Employee.dat"))) {
            //извлечь все записи в новый массив

            Employee[] newStaff = (Employee[]) in.readObject(); // чтение объектов
            //поднять зарплату секретарю

            newStaff[1].raiseSalary(10);

            //вывести вновь прочитанные записи о работниках
            for (Employee e : newStaff)
                System.out.println(e);
        }
    }
}

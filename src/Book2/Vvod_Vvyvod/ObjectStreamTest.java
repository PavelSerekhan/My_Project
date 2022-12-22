package Book2.Stream_.Vvod_Vvyvod;

import Book.ExtendsOOP.Employee;

import java.io.*;

public class RandomAccessTest {

    public static void main(String[] args) throws IOException {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        
        try(var out = new DataOutputStream(new FileOutputStream("e:employee.dat"))) {
            //сохранить все записи о работниках в файл employee.dat
            for (Employee e : staff)
                writeData(out, e);
        }
    }
    public static void writeData(DataOutput out, Employee e) {

    }
}

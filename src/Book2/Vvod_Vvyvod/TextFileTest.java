package Book2.Vvod_Vvyvod;

import Book.ExtendsOOP.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;

// для ввода текста лучше всего подходит класс PrintWriter

public class TextFileTest {
    public static void main(String[] args) throws IOException {

//        Employee[] staff = new Employee[3];
        var staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //сохранить все записи о работниках в файл employee.dat

        try (PrintWriter out = new PrintWriter("e:employee.txt", StandardCharsets.UTF_8)) {
            writeDate(staff, out);

            // без методов короче по коду получается
//            out.println(staff.length);
//            for (Employee e : staff)
//            out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
        }

        // извлечь все записи в новый массив
        try (Scanner in = new Scanner(new FileInputStream("e:employee.txt"),
                "UTF-8")) {
            Employee[] newStaff = readData(in);

            //вывести вновь прочитанные записи о работниках
            for (Employee e : newStaff)
                System.out.println(e);
        }
    }

    /**
     * Записывает данные обо всех работниках из массива в поток записи выводимых данных
     *
     * @param employees Массив записей о работниках
     * @param out       Поток записи выводимых данных
     */
    private static void writeDate(Employee[] employees, PrintWriter out) throws IOException {

        // Записать количество работников
        out.println(employees.length);
        for (Employee e : employees)
            writeEmployee(out, e);
    }

    /**
     * Направляет данные о работниках в поток записи выводимых данных
     *
     * @param out Поток записи выводимых данных
     */
    public static void writeEmployee(PrintWriter out, Employee e) {
        out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
    }

    /**
     * Читает записи о работниках из потока сканирования в массив
     *
     * @param in Поток сканирования вводимых данных
     * @return Массив записей о работниках
     */
    private static Employee[] readData(Scanner in) {

        // извлечь размер массива
        int n = in.nextInt();
        in.nextLine(); //перевести на новую строку

        var employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    /**
     * Считывает данные о работниках из буферизованного потока вводимых данных
     * @param in Поток сканирования вводимых данных
     */
    public static Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] tokens = line.split("\\|");
        String name = tokens[0];
        double salary = Double.parseDouble(tokens[1]);
        LocalDate hireDate = LocalDate.parse(tokens[2]);
        int year = hireDate.getYear();
        int month = hireDate.getMonthValue();
        int day = hireDate.getDayOfMonth();
        return new Employee(name, salary, year, month, day);
    }
}

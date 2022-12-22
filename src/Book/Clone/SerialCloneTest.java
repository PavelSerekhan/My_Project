package Book.Clone;

import java.io.*;
import java.time.LocalDate;

public class SerialCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var harry = new Employee_1("Harry Hacker", 35000,1989,10,1);

        // копировать объект harry
        var harry2 = (Employee_1) harry.clone();

        // модифицировать объект harry
        harry.raiseSalary(10);

        //теперь оригинал и клон объекта harry отличается
        System.out.println(harry);
        System.out.println(harry2);
    }
}

class SerialCloneable implements Cloneable, Serializable {

    public Object clone() throws CloneNotSupportedException {

        try {
            // сохранить объект в массиве байтов
            var bout = new ByteArrayOutputStream();
            try (var out = new ObjectOutputStream(bout)) {
                out.writeObject(this);
            }
            //ввести клон объекта из массива байтов
            try (var bin = new ByteArrayInputStream(bout.toByteArray())) {
                var in = new ObjectInputStream(bin);
                return in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            var e2 = new CloneNotSupportedException();
            e2.initCause(e);
            throw e2;
        }
    }
}
class Employee_1 extends SerialCloneable {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee_1 (String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name = " + name + ",salary = " + salary + ",hireDay = " + hireDay + "]";
    }
}


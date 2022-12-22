package Book.Clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        var original = new Employeee("John Q.Public", 50000);
        original.setHireDay(2000, 1, 1);

        Employeee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002,12,31);
        System.out.println("original = " + original);
        System.out.println("copy = " + copy);
    }
}

class Employeee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employeee clone() throws CloneNotSupportedException {

        // вызвать метод Object.clone()
        Employeee cloned = (Employeee) super.clone();

        //клонировать изменямые поля
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    /**
     * Устанавливает заданную дату приема на работу
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        //пример изменения поля экземпляра
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name = " + name + ",salary = " + salary + ",hireDay = " + hireDay + "]";
    }

}

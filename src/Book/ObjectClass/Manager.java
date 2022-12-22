package Book.ObjectClass;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee2{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    public  double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object object) {
       if (!super.equals(object))
           return false;
       var other = (Manager) object;

       return  bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus = " + bonus + "]";
    }
}

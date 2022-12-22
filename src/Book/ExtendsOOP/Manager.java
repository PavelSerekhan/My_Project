package Book.ExtendsOOP;

public class Manager extends Employee {
    private double bonus;
    private  Employee secretary;

    /**
     * @param name   Имя работника
     * @param salary Зарплата
     * @param year   Год приема на работу
     * @param month  Месяц приема на работу
     * @param day    День приема на работу
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    public Employee getSecretary() {
        return secretary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;  // слово super для вызова метода класса родителя!
    }

}

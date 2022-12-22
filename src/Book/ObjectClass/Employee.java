package Book.ObjectClass;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

        //equals
    // рекомендации для создания приближающего к идеалу метода equals  c221
    @Override
    public boolean equals(Object otherObject) {
        //быстро проверить объекты на идентичность
        if (this == otherObject)
            return true;
        //возвратить логическое значение false если явный параметр имеет пустое значение null
        if (otherObject == null)
            return false;
        //если классы не совпадают, они не равный
        if (getClass() != otherObject.getClass())  // getClass - возвращает класс объекта
            return false;
        //теперь извесно что объект obj относится к типу Employee
        Employee other = (Employee) otherObject;
        // проверить, хранятся ли в полях объектов одинаковые значения
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
        // В результате вызова метода Objects. equals (а, b) возвращается логическое значение
        // true, если оба его аргумента имеют nустое значение null; логическое значение false,
        // если только один из аргументов имеет nустое значение null; а иначе делается
        // вызов a.equals (b)
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,hireDay); // объединение все hash кодов
        // иначе return Object.hashCode(name) + Object.hashCode(salary) + Object.hashCode(hireDay)
    }

    @Override
    public String toString() {
            return "Employee[name = " + name + ", salary = " + salary
                     + ",hireDay = " + hireDay + "]";
    }

    //hashcode - адрес в памяти занимаемый объектом
        public static void main(String[] args) {
//            String name = "Pavel";
//            System.out.println(name.hashCode());
//            String name2 = "Polina";
//            System.out.println(name2.hashCode());
//            String s ="Ok";
//            StringBuilder sb = new StringBuilder(s);
//            System.out.println(s.hashCode() + " " + sb.hashCode());
//
//            String t =  new String("Ok");
//            StringBuilder tb = new StringBuilder(t);
//
//            System.out.println(t.hashCode() + " " + tb.hashCode());
//            System.out.println(s.hashCode()+ " " + t.hashCode());
//
//            System.out.println(s.equals(t));
        }

}

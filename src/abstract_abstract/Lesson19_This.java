package abstract_abstract;

/**
 * конструкторы - методы кот вызываются при создании нового объекта
 * идея конструкторa - инициализировать поля
 * при создании объекта сразу вызывается коструктор
 * перегрузка методов - одинаковые названия, до тех пор пока у них разные параметры
 */
public class Lesson19_This {
    public static void main(String[] args) {
        Human h1 = new Human("Egor", 12);
        System.out.println(h1.toString());
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override // переопределение метода, предназначение этого метода выводить строку!
            // если метод переопределить, то будет выводить как тебе надо!
    public String toString() {
        return name + "," + age;
    }
}





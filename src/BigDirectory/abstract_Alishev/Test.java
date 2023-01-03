package abstract_Alishev;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
        /**
         * абстрактный класс похож нп интерфейсы тем что методы без тела(без реализации)
         * интерфейс это контракт, это то, что класс умеет делать
         * абстрактный класс -это то, чем класс является
         */

    }
}

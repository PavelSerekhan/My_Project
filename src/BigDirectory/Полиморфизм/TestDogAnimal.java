package Полиморфизм;

/**
 * Полиморфизм - способность методов обрабатывать данные разных типов
 */
public class TestDogAnimal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //Upcasting - восходящее преобразование
        Animal animal = dog;

        //Downcasting - нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();

    }
}

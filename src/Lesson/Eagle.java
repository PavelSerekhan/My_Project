package Lesson;

public class Eagle extends Bird implements FlyingBird {
    public Eagle(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void fly() {
        System.out.println("Я летаю со скоростью до 200 км/ч");
    }
}

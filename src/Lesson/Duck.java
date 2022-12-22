package Lesson;

public class Duck extends Bird implements FlyingBird, Waterfowl{
    public Duck(String name, int age, boolean sex) {
        super(name, age, sex);
    }

    @Override
    public void swim() {
        System.out.println("Я плаваю для себя, а не для любителей гонок!");
    }
}

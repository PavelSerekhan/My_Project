package Lesson;

public class UnusualCar implements Car{
    @Override
    public void gas() {
        System.out.println("Этот авто газует по-другому!");
    }

    @Override
    public void brake() {
        System.out.println("Этот авто тормозит по-другому!");
    }
}

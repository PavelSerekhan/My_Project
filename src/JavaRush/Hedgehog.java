package JavaRush;

public class Hedgehog {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Hedgehog hedgehog = new Hedgehog();
        Apple apple = new Apple();
        hedgehog.eat(apple);
    }

    public static class Apple {

    }
}

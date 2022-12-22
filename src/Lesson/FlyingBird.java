package Lesson;

public interface FlyingBird {
    public default void fly(){
        System.out.println("Я просто летаю, отвалите!");
    }
}

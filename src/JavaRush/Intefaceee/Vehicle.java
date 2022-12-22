package JavaRush.Intefaceee;

public interface Vehicle {

    default void start(){
        System.out.println("Начинаю движение.");
    }
    default void stop(){
        System.out.println("Останавливаюсь.");
    }


}

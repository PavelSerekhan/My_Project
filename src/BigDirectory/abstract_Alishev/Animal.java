package abstract_Alishev;

/**
 * абстрактный класс это класс объекты которого не должны быть созданы
 */
public  abstract class Animal {

    public void eat(){
        System.out.println("I am eating...");
    }
    public abstract void makeSound(); //абстрактный метод не имеет реализации
    //

}

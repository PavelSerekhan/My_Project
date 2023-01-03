package Extends_Extends_Насделование;

public class Dog extends Animal{

    public void bark(){
        System.out.println("I'm barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

}

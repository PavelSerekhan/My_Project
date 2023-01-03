package Lesson;

public class Whale extends Cow{
    public void printName(){
        System.out.println("Это неправда: ");
        super.printName();

        System.out.println("Я – кит");
    }
}

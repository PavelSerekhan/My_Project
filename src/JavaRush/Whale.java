package JavaRush;

public class Whale extends Cow{

    @Override
    public void printName() {
        System.out.println("Я - кит");
    }

    public static void main(String[] args) {
        Cow cow = new Whale();
        if (cow instanceof Whale){
            Whale whale =   (Whale) cow;
        }
//        cow.printColor();
//        cow.printName();
        cow.printName();

//        Whale whale = new Whale();
//        whale.printName();
//        whale.printColor();
    }
}

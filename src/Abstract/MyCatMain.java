package Abstract;

public class MyCatMain {
    public static void main(String[] args) {
        MyCat myCat = new MyCat("Vasia");
        printName(myCat);
    }
    public static void printName(MyCat myCat){
        System.out.println(myCat.getName());
    }
}

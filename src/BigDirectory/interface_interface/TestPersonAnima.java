package interface_interface;

public class TestPersonAnima {
    public static void main(String[] args) {
        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
    }
    public static void outputInfo(Info info){
        info.showInfo();

    }
}

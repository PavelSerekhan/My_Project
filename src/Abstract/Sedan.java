package Abstract;

public class Sedan extends Car{

    @Override
    public void brake() {
        System.out.println("Седан тормозит!");
    }

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.gas();
    }
}

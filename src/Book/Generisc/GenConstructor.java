package Book.Generisc;

public class GenConstructor {
    private double value;

    public <T extends Number> GenConstructor(T arg) {
        value = arg.doubleValue();
    }
    public void showValues() {
        System.out.println("value: " + value);
    }
}

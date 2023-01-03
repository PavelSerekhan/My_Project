package Senla.flowers;

public class Narcissus extends AFlower {
    public Narcissus(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Narcissus{" +
                "color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}

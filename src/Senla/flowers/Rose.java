package Senla.flowers;

public class Rose extends AFlower {
    public Rose(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}

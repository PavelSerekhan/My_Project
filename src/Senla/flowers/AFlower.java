package Senla.flowers;

public abstract class AFlower {
    private String color;
    private int price;

    public AFlower(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

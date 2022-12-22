package JavaRush;

import java.util.Objects;

public class Iphone2 {

    private String model;
    private String color;
    private int price;

    public Iphone2(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass()) return false;

        Iphone2 iphone2 = (Iphone2) o;

        return price == iphone2.price && Objects.equals(model, iphone2.model) &&
                Objects.equals(color, iphone2.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }

    public static void main(String[] args) {
        Iphone2 iphone1 = new Iphone2("X", "Black", 999);
        Iphone2 iphone2 = new Iphone2("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}

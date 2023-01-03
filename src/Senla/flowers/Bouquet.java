package Senla.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<AFlower> flower = new ArrayList<>();
    private Integer price;

    public List<AFlower> getFlower() {
        return flower;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flower=" + flower +
                ", price=" + price +
                '}';
    }
}

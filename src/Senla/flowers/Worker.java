package Senla.flowers;

import java.util.Collections;

public class Worker {

    public Bouquet createBouquet(AFlower... flower) {
        Bouquet bouquet = new Bouquet();
        Collections.addAll(bouquet.getFlower(), flower);
        bouquet.setPrice(calculatorPrice(bouquet));
        return bouquet;
    }

    private int calculatorPrice(Bouquet bouquet) {
        return bouquet.getFlower().stream()
                .map(AFlower::getPrice)
                .mapToInt(x -> x)
                .sum();
    }

    public void addFlower(Bouquet bouquet, AFlower flower) {
        bouquet.getFlower().add(flower);
        int price = bouquet.getPrice() + flower.getPrice();
        bouquet.setPrice(price);
    }

    public void removeFlower(Bouquet bouquet, AFlower flower) {
        bouquet.getFlower().remove(flower);
        int price = bouquet.getPrice() - flower.getPrice();
        bouquet.setPrice(price);
    }

    public void printBouquet(Bouquet bouquet) {
        System.out.println(bouquet);
        System.out.println("Количество цветков в букете " + bouquet.getFlower().size());
        System.out.println("Стоимость букета " + bouquet.getPrice());
    }
}

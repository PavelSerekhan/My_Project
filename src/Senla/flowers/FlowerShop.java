package Senla.flowers;

public class FlowerShop {
    private static Worker worker = new Worker();

    public static void main(String[] args) {
        AFlower rose = new Rose("red", 10);
        AFlower narcissus = new Narcissus("yellow", 20);
        AFlower whiteRose = new Rose("white", 10);

        Bouquet bouquet = worker.createBouquet(rose, narcissus, whiteRose);
        worker.printBouquet(bouquet);

        worker.removeFlower(bouquet, narcissus);
        worker.printBouquet(bouquet);
    }
}

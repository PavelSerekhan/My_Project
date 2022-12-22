package Senla.Tank;

public class BuilderSecondPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        IProductPart tower = new Tower("Green", "Большая");
        System.out.println("Двигатель готов!");
        return tower;
    }
}

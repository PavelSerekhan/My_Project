package Senla.Tank;

public class BuilderThirdPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        IProductPart engine = new Engine("222", 1000);
        System.out.println("Двигатель готов!");
        return engine;
    }
}

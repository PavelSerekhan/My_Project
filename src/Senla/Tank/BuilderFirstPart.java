package Senla.Tank;

public class BuilderFirstPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        IProductPart body = new Body("IS78", "green");
        System.out.println("Корпус готов!");
        return body;
    }
}

package Senla.Tank;

public class AssemblyLine implements IAssemblyLine {
    private ILineStep bodyLineStep;
    private ILineStep towerLineStep;
    private ILineStep engineLineStep;

    public AssemblyLine(ILineStep bodyLineStep, ILineStep towerLineStep, ILineStep engineLineStep) {
        this.bodyLineStep = bodyLineStep;
        this.towerLineStep = towerLineStep;
        this.engineLineStep = engineLineStep;
    }

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(bodyLineStep.buildProductPart());
        System.out.println("Установить корпус");
        product.installSecondPart(towerLineStep.buildProductPart());
        System.out.println("Установить башню");
        product.installThirdPart(engineLineStep.buildProductPart());
        System.out.println("Установить двигатель");
        System.out.println("Танк готов!");
        return product;
    }
}

package Senla.Tank;

public class AssemblyLine implements IAssemblyLine{
    private ILineStep bodyLineStep;
    private ILineStep towerLineStep;
    private ILineStep engineLineStep;

    @Override
    public IProduct assembleProduct(IProduct product) {
        product.installFirstPart(bodyLineStep.buildProductPart());
        System.out.println("Install body");
        product.installSecondPart(towerLineStep.buildProductPart());
        System.out.println("Install tower");
        product.installThirdPart(engineLineStep.buildProductPart());
        System.out.println("Install engine");
        System.out.println("Tank is done");
        return product;
    }
}

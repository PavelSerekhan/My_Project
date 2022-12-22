package Senla.Tank;

public class task3 {
    public static void main(String[] args) {
        IProduct tank = new Tank();
        AssemblyLine tankLine = new AssemblyLine(new BuilderFirstPart(), new BuilderSecondPart(),
                new BuilderThirdPart());

        tankLine.assembleProduct(tank);
        System.out.println("Результат: " + tank.toString());
    }
}

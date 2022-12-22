package Senla.Tank;

public class task3 {
    public static void main(String[] args) {
        IProduct tank = new Tank();

        AssemblyLine tankLine = new AssemblyLine();

        BuilderFirstPart body = new BuilderFirstPart();
        BuilderSecondPart tower = new BuilderSecondPart();
        BuilderThirdPart engine = new BuilderThirdPart();

        tankLine.assembleProduct(tank);

//        System.out.println("Работа закончена!");
    }
}

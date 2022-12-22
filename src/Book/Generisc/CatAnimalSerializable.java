package Book.Generisc;

public class CatAnimalSerializable<T extends String, V extends Animal, K extends Number> {
    private T obT;
    private V obV;
    private K obK;

    public CatAnimalSerializable(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public void showTyp() {
        System.out.println("Тип Т: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());
        System.out.println("Тип K: " + obK.getClass().getName());
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }

    public static void main(String[] args) {
        ThreeGen<String, Cat, Double> threeGen =
                new ThreeGen<>("str",new Cat(),3.33);

        threeGen.showTyp();
    }
}

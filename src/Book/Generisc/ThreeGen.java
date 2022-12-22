package Book.Generisc;

public class ThreeGen<T, V, K> {
    private T obT;
    private V obV;
    private K obK;

    public ThreeGen(T obT, V obV, K obK) {
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
        ThreeGen<Integer,String,Double> threeGen =
                new ThreeGen<>(777,"Bond", 7.77);
        threeGen.showTyp();
    }
}

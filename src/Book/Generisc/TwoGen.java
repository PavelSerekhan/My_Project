package Book.Generisc;

/**]
 * Generics - это обобщенный класс
 */
public class TwoGen<T, V> {
    private T obT;
    private V obV;

    public TwoGen(T obT, V obV) {
        this.obT = obT;
        this.obV = obV;
    }

    public void showTypes() {
        System.out.println("Тип Т: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());

    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88,"Generics");
        twoGen.showTypes();

        System.out.println("Значение Т: " + twoGen.getObT());
        System.out.println("Значение V: " + twoGen.getObV());

    }
}

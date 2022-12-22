package Book.Generisc;

public class GenMethodDemo {

    public static <T, V> boolean isIn(T x, V[] array) {
        for (V element : array) {
            if (x.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        if (isIn(6, array)) {
            System.out.println("2 входит в массив array ");
        }
        if (!isIn(7,array)) {
            System.out.println("7 не входит в массив array ");
        }
        System.out.println();


        String[] strArray = {"one", "two", "three", "four", "five"};
        if (isIn("two", strArray)) {
            System.out.println("two входит в массив strArray");
        }
        if (!isIn("seven", strArray)) {
            System.out.println("seven не входит в массив strArray");
        }
    }
}

package Book.Generisc;

public class Average<T extends Number> { //ограничения
    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }

    public double methodsAverage() {
        double sum = 0.0;
        for (T value : array) {
            sum += value.doubleValue(); // doubleValue объявлен в классе Number
        }
        return sum / array.length;
    }

    //подстановочный тип ?
    public boolean saveAvg(Average<?> ob) { //  ? любого типа соответствующему T extends Number
        return methodsAverage() == ob.methodsAverage();
    }


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<>(array);
        System.out.println("Среднее значение для Integer " + integerAverage.methodsAverage());

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleAverage = new Average<>(doubles);
        System.out.println("Среднее значение для Double " + doubleAverage.methodsAverage());

        System.out.println("Среднее значение для integerAverage и doubleAverage ");

        if (integerAverage.saveAvg(doubleAverage)) {
            System.out.println("одинаковые");
        } else {
            System.out.println("разные");
        }
    }
}

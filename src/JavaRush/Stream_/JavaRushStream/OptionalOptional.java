package JavaRush.Stream_.JavaRushStream;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalOptional {
    /**
     * Цель этого класса – просто хранить в себе объект T (ссылку на объект типа T).
     * Ссылка на объект внутри класса Optional<T> может быть null.
     * Один объект Optional всегда можно сравнить с другим объектом Optional через метод equals,
     * даже если они хранят в себе ссылки на null.
     *
     * Грубо говоря, класс Optional позволяет «более красиво» записывать проверки на null и
     * действия в случае, если внутри объект Optional хранится null.
     */
//    public void printString(String s) {
//        Optional<String> str = Optional.ofNullable(s);
//        System.out.println(str.orElse(""));
//    }

    /**
     * Задача метода printList(List<String>) — вывести в консоли все элементы списка, полученного как параметр, в том же порядке. Но есть один нюанс. В списке могут быть элементы, равные null.
     * <p>
     * Твоя задача — вывести все элементы списка в консоли, а вместо null — фразу: Этот элемент равен null
     * В методе printList(List<String>) нельзя использовать циклы, оператор if/else и тернарный оператор.
     * Для проверки равенства строки на null и замены её на другую строку есть метод orElse объекта типа Optional<String>.
     */
//    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");
//
//        printList(strings);
//    }

//    public static void printList(List<String> list) {
//        String text = "Этот элемент равен null";

//        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
//        list.stream().map(x -> Optional.ofNullable(x).orElse(text)).forEach(System.out::println);
//    }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"Привет", "как","дела?");
//
//        Stream<String> stream = list.stream();
//        Optional<String> optionalS = stream.findFirst();
//        String str = optionalS.get();
//       ||
//        String str = list.stream().findFirst().get();  //метод get()-вытаскивание значения,
//         которое хранится внутри Optional

    /**
     * Пример — поиск строки с минимальной длиной:
     */
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "Привет", "как", "дела?");
//
//        Stream<String> stream = list.stream();
//        Optional<String> optional = stream.min((s1, s2) -> s1.length() - s2.length());
//        String str = optional.get();
//        //       ||
//        String str1 = list.stream().max((s1, s2) -> s1.length() - s2.length()).get();
//
//        System.out.println("минимальная длина: " + str);
//        System.out.println("максимальная длина: " + str1);
//    }

    /**
     * У автомобиля, представленного классом Car, есть две характеристики: название - поле name,
     * цена - поле price.
     * В классе Solution выполняются две операции поиска:
     *
     * метод getMostExpensiveCar(Stream<Car>) ищет самый дорогой автомобиль в одном списке;
     * метод getMoreExpensiveCar(Stream<Car>, Car) в другом списке ищет автомобиль дороже, чем
     * полученный в методе getMostExpensiveCar(Stream<Car>).
     * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
     * Подсказка:
     * Для поиска элемента с максимальным искомым значением в потоке данных используй метод
     * max(), а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных
     * данных используй метод findFirst().
     */
//    public static void main(String[] args) {
//        var tesla = Stream.of(
//                new Car("Model S", 94_490),
//                new Car("Model 3", 50_690),
//                new Car("Model X", 99_690),
//                new Car("Model Y", 65_000)
//        );
//
//        var bmw = Stream.of(
//                new Car("X5", 110_000),
//                new Car("X3", 54_000),
//                new Car("X7", 143_000),
//                new Car("X6", 125_000)
//        );
//
//        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
//        mostExpensiveCar.ifPresent(System.out::println);
//
//        Optional<Car> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
//        moreExpensiveCar.ifPresent(System.out::println);
//    }
//
//    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
//        //напишите тут ваш код
//        return cars.max((s1,s2)->s1.getPrice()- s2.getPrice());
//    }
//
//    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
//        //напишите тут ваш код
//        return cars.filter(s -> s.getPrice() > mostExpensiveCar.getPrice()).findFirst();
//    }
//}
//
//class Car {
//    private String name;
//    private Integer price;
//
//    public Car(String name, Integer price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return "Автомобиль " + name + ", цена - " + price + " USD";
//    }
//}

    /**
     * У автомобиля, представленного классом Car, есть две характеристики: название - поле name,
     * цена - поле price.
     * В классе Solution выполняются две операции поиска:
     * <p>
     * метод getCheapestCar(Stream<Car>) ищет самый дешевый автомобиль в одном списке;
     * метод getCheaperCar(Stream<Car>, Car) в другом списке ищет автомобиль дешевле, чем
     * полученный в методе getCheapestCar(Stream<Car>).
     * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
     * Подсказка:
     * Для поиска элемента с минимальным искомым значением в потоке данных используй метод min(),
     * а чтобы найти первый попавшийся подходящий элемент из потока отфильтрованных данных используй
     * метод findFirst().
     */
    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X1", 40_000),
                new Car("X6", 125_000)
        );

        Optional<Car> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getCheapestCar(Stream<Car> cars) {
        //напишите тут ваш код
        return cars.min((s1, s2) -> s1.getPrice() - s2.getPrice());
    }

    public static Optional<Car> getCheaperCar(Stream<Car> cars, Car cheapestCar) {
        //напишите тут ваш код
        return cars.filter(s -> s.getPrice() < cheapestCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}


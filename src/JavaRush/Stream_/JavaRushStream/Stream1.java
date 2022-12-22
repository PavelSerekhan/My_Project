package JavaRush.Stream_.JavaRushStream;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Stream1 {
    /**
     * Преобразование данных
     *  метод, который позволяет преобразовать данные из одного типа в другой--map().
     */
//    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//    Stream<String> stream2 = stream.map((x) -> String.valueOf(x));
    /**
     * Преобразование числа в строку
     */
//    Stream<String> stringStream = stream.map(String::valueOf); // из числа в строку
    /**
     * Преобразование строки в число
     */
//    Stream<Integer> StrGoInt = stringStream.map(Integer::parseInt); //из строки в число

    /**
     * Преобразование строки в URI
     */
//    public static void main(String[] args)  {
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("https://google.com");
//        list.add("https://linkedin.com");
//        list.add("https://yandex.com");
//
//        Stream<URI> stream = list.stream().map(str ->
//        {
//            try
//            {
//                return new URI(str);
//            }
//            catch (URISyntaxException e)
//            {
//                e.printStackTrace();
//                return null;
//            }
//        });
//    }

    /**
     * У учетной записи (класс Account) есть имя (поле name) и электронный ящик (поле email).
     * Нужно, чтобы метод getEmails(ArrayList<Account>) в классе Solution возвращал поток
     * электронных ящиков всех учетных записей из списка, полученного в качестве входящего
     * аргумента.
     *
     * Подсказка:
     * Для преобразования потока данных одного типа в другой используй метод map() объекта
     * типа Stream<Account>.
     */
//    public static void main(String[] args) {
//        var accounts = new ArrayList<Account>();
//        Collections.addAll(accounts,
//                new Account("Elly", "elly@yandex.ru"),
//                new Account("Jocker", "jocker@gmail.com"),
//                new Account("Neo", "neo@yahoo.com"));
//
//        Stream<String> emails = getEmails(accounts);
//        emails.forEach(System.out::println);
//    }
//
//    public static Stream<String> getEmails(ArrayList<Account> accounts) {
//        //напишите тут ваш код
//        return accounts.stream().map(Account::getEmail);
//    }

    /**
     * Реализуй метод toUpperCase(Stream<String>) так, чтобы он возвращал поток таких же строк,
     * что и во входящем потоке, только в верхнем регистре.
     * Поскольку это будет поток уже других строк, для преобразования используй метод map()
     * объекта типа Stream<String>.
     *
     * @param args
     */
//     public static void main(String[] args) {
//        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");
//
//        toUpperCase(stream).forEach(System.out::println);
//    }
//
//    public static Stream<String> toUpperCase(Stream<String> strings) {
//        //напишите тут ваш код
//
//        return strings.map(String::toUpperCase);
//    }


//    public static void main(String[] args) {
//        List<Car> models = Arrays.asList(new Car("BMW", 2011),
//                new Car("Audi", 2018), new Car("Peugeot", 2015));
//
//        //  allMatch() - возвращает true если все элементы этого
//        //  потока соответствуют предоставленному предикату.
//
//        boolean all = models.stream().allMatch(model -> model.getYear() > 2010);
//        System.out.println("Все модели новее 2010 года: " + all);
//
//        //anyMatch() - возвращает true если какой-либо элемент этого потока
//        // соответствует указанному предикату.
//
//        boolean any = models.stream().anyMatch(model -> model.getYear() > 2016);
//        System.out.println("Есть ли модели новее 2016 года: " + any);
//
//        //noneMatch() - возвращает true если ни один элемент этого
//        // потока не соответствует указанному предикату.
//
//        boolean none = models.stream().noneMatch(model -> model.getYear() < 2010);
//        System.out.println("Есть машина старше 2010 года: " + none);
//    }

//    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        boolean result = stream.anyMatch(x -> x > 4);
//
//        Stream<Integer> stream1 = Stream.of(1, -2, 3, -4, 5);
//        boolean result1 = stream1.filter(x -> x < 0).anyMatch(x -> x > 0);
//        System.out.println(result1);

//        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
//        boolean result2 = stream2.allMatch(x -> x > 0);

//        Stream<Integer> stream3 = Stream.of(1, -2, 3, -4, 5);
//        boolean result3 = stream3.filter(x -> x < 0).allMatch(x -> x < 0);
//        System.out.println(result3);
//
//        Stream<Integer> stream4 = Stream.of(1, -2, 3, -4, 5);
//        boolean result4 = stream4.filter(x -> x < 0).noneMatch(x -> x > 0);
//        System.out.println(result4); // Ни один элемент не удовлетворяет условию то будет true
//    }

    /**
     *Программа анализирует поток чисел. Логика программы следующая:
     *
     * Метод hasNegativeEvenNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть хотя бы одно отрицательное четное число и false, если таких чисел нет. Для поиска чисел в потоке используй метод anyMatch() объекта типа Stream<Integer>.
     * Метод hasOnlyPositiveNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть только положительные числа и false, если есть хотя бы одно отрицательное число. Для поиска чисел в потоке используй метод allMatch() объекта типа Stream<Integer>.
     * Метод hasOnlyNegativeNumbers(Stream<Integer>) возвращает true, если во входящем потоке есть только отрицательные числа и false, если есть хотя бы одно положительное число. Для поиска чисел в потоке используй метод noneMatch() объекта типа Stream<Integer>.
     */
//    public static void main(String[] args) {
//        String answerYes = "Yes";
//        String answerNo = "No";
//
//        Stream<Integer> stream1 = Stream.of(10, -22, 3, 12, -85, 0, 142);
//
//        String answerNegativeEvenNumbers = hasNegativeEvenNumbers(stream1) ? answerYes : answerNo;
//        System.out.println("Any negative even numbers in the stream? " + answerNegativeEvenNumbers);
//
//        Stream<Integer> stream2 = Stream.of(10, 22, 3, 12, 85, 142);
//
//        String answerOnlyPositiveNumbers = hasOnlyPositiveNumbers(stream2) ? answerYes : answerNo;
//        System.out.println("Only positive numbers in the stream? " + answerOnlyPositiveNumbers);
//
//        Stream<Integer> stream3 = Stream.of(-10, -22, -3, -12, -85, -142);
//
//        String answerOnlyNegativeNumbers = hasOnlyNegativeNumbers(stream3) ? answerYes : answerNo;
//        System.out.println("Only negative numbers in the stream? " + answerOnlyNegativeNumbers);
//    }
//
//    public static boolean hasNegativeEvenNumbers(Stream<Integer> stream) {
//        //напишите тут ваш код
//        return stream.anyMatch(x -> x < 0 && x % 2 == 0);
//    }
//
//    public static boolean hasOnlyPositiveNumbers(Stream<Integer> stream) {
//        //напишите тут ваш код
//        return stream.allMatch(x -> x > 0);
//    }
//
//    public static boolean hasOnlyNegativeNumbers(Stream<Integer> stream) {
//        //напишите тут ваш код
//        return stream.noneMatch(x -> x > 0);
//    }

    /**
     * В классе Solution метод hasExpiredProduct(Stream<Product>) возвращает true, если во входящем потоке товаров есть хотя бы один просроченный и возвращать false, если таких товаров нет.
     * <p>
     * Чтобы это проверить, нужно у каждого товара в потоке сравнить поле expirationDate (годен до) типа LocalDate с текущей датой (статический метод now() класса LocalDate). Если срок годности меньше (строго) текущей даты, то в этом потоке есть просроченные товары.
     * Для поиска таких товаров в потоке используй метод anyMatch() объекта типа Stream<Product>.
     */

//    public static void main(String[] args) {
//        var productStream = Stream.of(
//                new Product("Milk", LocalDate.of(2020, Month.MARCH, 12)),
//                new Product("Cheese", LocalDate.of(2020, Month.MARCH, 31)),
//                new Product("Buckwheat", LocalDate.of(2021, Month.MARCH, 1)),
//                new Product("Rice", LocalDate.of(2022, Month.MAY, 11)),
//                new Product("Wine", LocalDate.of(2023, Month.JANUARY, 10)),
//                new Product("Tea", LocalDate.of(2024, Month.AUGUST, 27)),
//                new Product("Salt", LocalDate.of(2025, Month.DECEMBER, 15))
//        );
//
//        String answer = hasExpiredProduct(productStream) ? "Yes" : "No";
//        System.out.println("Has stream expired products? " + answer);
//    }
//
//    public static boolean hasExpiredProduct(Stream<Product> productStream) {
//        //напишите тут ваш код
//
//        return productStream.anyMatch(x -> (x.getExpirationDate().isBefore(LocalDate.now())));
//    }
//}
//
//class Product {
//    private String name;
//    private LocalDate expirationDate;
//
//    public Product(String name, LocalDate expirationDate) {
//        this.name = name;
//        this.expirationDate = expirationDate;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public LocalDate getExpirationDate() {
//        return expirationDate;
//    }
}




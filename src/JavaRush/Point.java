package JavaRush;

public class Point {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
//        Integer a = 5;
//        String b = "adw";
//        System.out.println(a.equals(b)); false
//        System.out.println(b.equals(a)); false

//        Object s = 5;
//        Object q = 5;
//        System.out.println(s.equals(q)); // true

        Point a = new Point();
        a.name = "Ana";

        Point b = new Point();
        b.name = "Ana";

        System.out.println(a==b); // Метод equals просто сравнивает у себя внутри ссылки a и b.
        System.out.println(a.equals(b)); //класса String сравнение работает по-другому



    }
}

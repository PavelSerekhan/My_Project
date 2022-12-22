package Test;

public class StringPool {
    public static void main(String[] args) {
        //строки надо сравнивать методом equals!!!!
        //pool предназначен для хранения строковых значений!
        String str = "Hello World!"; // смотрит в пуле нет ли такого значения
        //если есть, то присвоит ссылку str на значение, если нет, то создаст новое значение
        String str1 = "Hello World!";
        String q = str.intern();
        String s = str1.intern();
        System.out.println(q == s);// true, насильно поместили в pool!
//        System.out.println(str == str1);
        String str2 = new String("Hello world!");
//        System.out.println(str == str2);

        String a = "hello";
        String b = "hello123".substring(0, 5);
        System.out.println(a == b);
        System.out.println(a.equals(b));

//        /** сравнение примитивов
//         *
//         */
//        int x = 1;
//        int y = 1;
//        System.out.println( x == y);


    }
}
package Test;
// для методов указывается тип значения. А чтобы вернуть это самое
// значение из методов используется ключевое слово return.
// return мгновенно завершает метод!!!

public class ReTuRn {
    //    public static void main(String[] args) {
//        System.out.println(getHelloNessage());
//    }
//
//    public static String getHelloNessage() {
//        return "Hello World";
//    }
    public static void main(String[] args) {
        int res = some_res(4, 6, 1);
        System.out.println(res);
    }

    public static int some_res(int a, int b, int c) {
        return a + b + c;
    }
}

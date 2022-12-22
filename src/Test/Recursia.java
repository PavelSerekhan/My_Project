package Test;

import java.io.File;

/*
рекурсия вызов метода в теле этого же метода
рекурсивный вызов - один вызов ждет другого
когда последний вызов выполняется то поочередно выходят из метода все вызовы которые ждали выполнение
последнего
 */
public class Recursia {
    public static void main(String[] args) {
//    someMethod();

        System.out.println(fac(4));

//        counter(3);
    }
//    private static void someMethod() {
//        /**
//         * бесконечный метод! вызываем метод, выводим строку, вызываем метод, метод выводит строку
//         * и так далее
//         */
//        System.out.println("Hello!");
//        someMethod();
//    }
//    private static void counter(int n) {
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        counter(n - 1);
//    }

    //факториал
    //15! = 15 * 14 * ... * 1
    // fac(4)
    // 4 * fac(3)
    // 3 * fac(2)
    // 2 * fac(1)
    // fac(1) = return 1;

    private static int fac(int n) {
        if (n == 1)
            return 1;
        return n * fac(n - 1);
    }
}

package Exceptoins1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptoins1 {
    public static void main(String[] args) {
        File file = new File("spvm,");

        try { // try - попытаться
            Scanner scanner = new Scanner(file);
            /**
             * если исключение выбрасывается в блоке try, то в блоке try дальше код не выполняется
             * переходит в блок catch, если нет исключения то выполняется весь код кроме блока  catch
             */
            System.out.println("после Scanner'a");
        } catch (FileNotFoundException e) {
            /**
             * в блоках try catch можно реализовывать свой вывод ошибки
             */
//            e.printStackTrace();
            System.out.println("Файл не найден!");
        }
        /** после блока try catch код выполняется
         *
         */
        System.out.println("После блока try catch");
    }
}

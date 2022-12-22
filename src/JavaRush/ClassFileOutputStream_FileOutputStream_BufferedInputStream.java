package JavaRush;

import java.io.*;

public class ClassFileOutputStream_FileOutputStream_BufferedInputStream {

    public static void main(String[] args) throws IOException {
        /**
         * Главное назначение класса FileOutputStream — запись байтов в файл.
         */
//        File file = new File("E:\\pushkin.txt");
        FileOutputStream outputStream = new FileOutputStream("E:\\pushkin.txt", true);
        //начение true, данные будут дозаписаны в конец файла

        String greeting = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, " +
                "кто хочет стать программистом!\r\n";

        outputStream.write(greeting.getBytes());
        outputStream.close();

        /**
         * У класса FileInputStream назначение противоположное — чтение байтов из файла.
         */
        FileInputStream input = new FileInputStream("E:\\test.txt");
        int i;
        while ((i = input.read()) != -1) {
            System.out.print((char) i);
        }

        /**
         * Класс BufferedInputStream.
         * Обращение к источнику данных, например, чтение из файла, — дорогостоящая в
         * плане производительности операция. И каждый раз обращаться к файлу для чтения
         * по одному байту расточительно.
         * Поэтому BufferedInputStream считывает данные не по одному байту,
         * а блоками и временно хранит их в специальном буфере.
         * Это позволяет нам оптимизировать работу программы за счет того,
         * что мы уменьшаем количество обращений к файлу.
         */

        FileInputStream fileInputStream = new FileInputStream("E:\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int a;
        while ((a = bufferedInputStream.read()) != -1) {

            System.out.print((char) a);
        }
    }
}

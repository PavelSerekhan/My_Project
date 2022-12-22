package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader_ {
    /**
     * Метод int read()
     * <p>
     * Это метод читает из потока один char и возвращает его.
     * Тип char расширяется до типа int, но первые два байта результата всегда нули.
     * <p>
     * Метод int read(char[] buffer)
     * <p>
     * Это вторая модификация метода read(). Он позволяет считать из
     * Reader сразу массив символов. Массив для символов нужно передать в
     * качестве параметра. Метод возвращает число — количество реально прочитанных символов.
     * <p>
     * Метод skip(long n)
     * <p>
     * Этот метод позволяет пропустить n первых символов из объекта Reader.
     * Работает точно так же, как аналогичный метод класса InputStream.
     * Возвращает число символов, которые были реально пропущены.
     * <p>
     * Метод boolean ready()
     * <p>
     * Возвращает true, если в потоке есть еще не прочитанные байты.
     * <p>
     * Метод void close()
     */

    public static void main(String[] args) throws IOException {

//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//
//        try (FileReader reader = new FileReader(src);  //Reader для чтения из файла
//             FileWriter writer = new FileWriter(dest)) { //Writer для записи в файл
//
//            char[] buffer = new char[65536];  //Буфер, в который будем считывать данные
//            while (reader.ready()){           //Пока данные есть в потоке
//                int real = reader.read(buffer);  //Читаем данные в буфер
//                writer.write(buffer,0,real);  //Записываем данные из буфера во второй поток
//            }
//        }

//        try (Scanner scanner = new Scanner(System.in)) {
//
//            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
//            for(String str : lines){
//
////            lines.forEach(str -> {
//
//                char[] chars = str.toCharArray();
//                for (char character : chars) {
//                    if (character != ' ' && character != '.' && character != ',') {
//                        System.out.print(character);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }


    }
}

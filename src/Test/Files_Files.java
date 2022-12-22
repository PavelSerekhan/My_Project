package Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Files - утилитный класс, куда были вынесены статические метолы из класса File.   Files - примерно
то же, что и Arrays или Colections, только работает он с файлами, а не с массивами или коллекциями.
Он сосредоточен на управлении файлами и директориями. Используя статические методы Files, мы можем
создавать, удалять и перемещать файлы и директории.

Большинство методов класса Files принимают на вход также объекты Path.
Тут твоим верным помощником станет метод Paths.get() — активно им пользуйся.
 */
public class Files_Files {
    public static void main(String[] args) throws IOException {
        //создание файла
//        Path testFile1 = Files.createFile(Paths.get("E:\\SomeDir\\testFile111.txt"));
//        System.out.println("Был ли файл успешно создан?");
//        System.out.println(Files.exists(Paths.get("E:\\SomeDir\\testFile111.txt")));

//        //создание директории
//        Path testDirectory = Files.createDirectory(Paths.get("E:\\SomeDir\\testDirectory"));
//        System.out.println("Была ли директория успешно создана?");
//        System.out.println(Files.exists(Paths.get("E:\\SomeDir\\testDirectory")));

//        // перемещаем файл
//        testFile1 = Files.move(testFile1, Paths.get("E:\\SomeDir\\testDirectory\\testFile111.txt"));
//        System.out.println("Был ли наш файл перемещен в testDirectory?");

//        System.out.println(Files.exists(Paths.get("E:\\SomeDir\\testDirectory\\testFile111.txt")));
//        //Files.delete(testFile1);

//        //создание директории
//        Path testDirectory2 = Files.createDirectory(Paths.get("E:\\SomeDir\\testDirectory2"));
//        testFile1 = Files.copy(testFile1, Paths.get("E:\\SomeDir\\testDirectory2\\testFile111.txt"));
//        System.out.println("Был ли наш файл скопирован в testDirectory2?");

//        System.out.println(Files.exists(Paths.get("E:\\SomeDir\\testDirectory2\\testFile111.txt")));
//    Но класс Files позволяет не только управлять самими файлами, но и работать с его содержимым.
//

/**   Для записи данных в файл у него есть метод write(), а для чтения — целых 3: read(),
 readAllBytes() и readAllLines()
 readAllLines() тип возвращаемого значения — List<String>
 */

//        List<String> lines = Files.readAllLines(Paths.get("E:\\pushkin.txt"));
//        for (String s : lines){
//            System.out.println(s);
//        }


        /*
        найти в файле все строки, которые начинаются со слова «Как»,
         привести их к UPPER CASE и вывести в консоль.
         */
//        List<String> lines = Files.readAllLines(Paths.get("E:\\SomeDir\\pushkin.txt"));
//        List<String> result = new ArrayList<>();
//        for (String s : lines){
//            if (s.startsWith("Как")){
//                String upper = s.toUpperCase();
//                result.add(upper);
//            }
//        }
//        for (String s1 : result){
//            System.out.println(s1);
//        }

        /**
         * Напиши программу, которая считывает из консоли имя текстового файла,
         * далее читает символы из этого файла (используй метод readAllLines(Path)
         * класса Files) и выводит на экран все, за исключением точки, запятой и пробела.
         */

//        try{
//            List<String> list = Files.readAllLines(Paths.get("e:pushkin.txt"));
//            for(String str : list){
//                char[] chars = str.toCharArray();
//                for (int i = 0; i < chars.length; i++) {
//                    if (chars[i] != ' ' && chars[i] != '.' && chars[i] != ',') {
//                        System.out.print(chars[i]);
//                    }
//                }
//            }
//        } catch (Exception e){
//            System.out.println("Something went wrong: " + e);
//        }
//        ||
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

package JavaRush;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files_Files {
//    public static void main(String[] args) throws IOException {
    /**
     *  Создание файлов и директорий
     */
//        Files.createFile(Path.of("e:\\readme.txt"));
//        Files.createDirectory(Path.of("e:\\directory"));
//        Files.createDirectories(Path.of("e:\\directory\\1\\2"));
    /**
     * Копирование, перемещение и удаление
     */
//        Path path = Path.of("e:\\readme.txt");
//        Path path1 = Path.of("e:\\readme-copy.txt");
//        Files.copy(path,path1); //копирует файл

//        Files.move(path,path1); // перемещает и переименовывает файл

//        Files.delete(path); // удаляет файл
    /**
     * Проверка типа файла и факта существования
     */
//        Files.isRegularFile(Path.of("e:\\readme.txt")); //Проверяет, что путь — это файл, а не директория
//        Files.isDirectory(Path.of("e:\\Foto")); //Проверяет, что путь — это директория, а не файл
//        Files.exists(Path.of("e:\\directory\\1\\2"));  // Проверяет, что объект по заданному пути существует
//        Files.size(Path.of("e:\\readme.txt"));
    /**
     * Работа с содержимым файла
     */
//        Path path2 = Path.of("E:\\pushkin.txt");
//        List<String> list = Files.readAllLines(path2);
//
//        list.forEach(s -> System.out.println(s));


    /**
     * Напиши программу, которая будет считывать с клавиатуры строки, и если данная строка — это путь к существующему файлу, выводить в консоли "<введенная строка> - это файл". Если путь к существующей директории, выводить в консоли "<введенная строка> - это директория".
     * Если строка не является путем к файлу или директории, то выходим из программы. Треугольные скобки и кавычки выводить не нужно.
     * Для проверки файлов и директорий используй методы isRegularFile() и isDirectory() класса Files.
     */
//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) throws IOException {
    //напишите тут ваш код

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String str = scanner.nextLine();
//            if (str.isEmpty()) {
//                break;
//            }
//            if (Files.isRegularFile(Path.of(str))) {
//                System.out.println(str + THIS_IS_FILE);
//            } else if (Files.isDirectory(Path.of(str))) {
//                System.out.println(str + THIS_IS_DIR);
//            } else {
//                break;
//            }
//        }

    /**
     * Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.
     * <p>
     * 1. Если файла по первому пути не существует, его нужно создать.
     * <p>
     * 2. Если же файл по первому пути существует, нужно переместить
     * этот файл по второму пути, но только в том случае, если по второму пути файла нет.
     * <p>
     * 3. Если же он есть, нужно просто удалить файл по первому пути.
     * <p>
     * Используй соответствующие
     * методы класса Files: createFile(), move(), delete(), exists()/notExists().
     */

//        Scanner scanner = new Scanner(System.in);
//        Path filePath = Path.of(scanner.nextLine());
//        Path fileNewPath = Path.of(scanner.nextLine());
//
//        if(Files.notExists(filePath)){
//            Files.createFile(filePath);
//        } else if (Files.exists(filePath) && Files.notExists(fileNewPath)){
//            Files.move(filePath,fileNewPath);
//        } else  if (Files.exists(fileNewPath)){
//            Files.delete(filePath);
//        }


//        Path path = Path.of("c:\\windows");
//
//        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
//            for (Path s : files){
//                System.out.println(s);
//            }
//            files.forEach(System.out::println);
//        }


//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path directory = Path.of(scanner.nextLine());
//        //напишите тут ваш код
//        try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)) {
//            files.forEach(s ->
//            {
//                if (Files.isRegularFile(s)){
//                    System.out.println(s + THIS_IS_FILE);
//                } else if (Files.isDirectory(s)){
//                    System.out.println(s + THIS_IS_DIR);
//                }
//            });
//        }

    /**
     *Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
     * Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
     */

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());


        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.copy(path, resolve);
                }
            }
        }
    }
}




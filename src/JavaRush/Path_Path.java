package JavaRush;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Path — это класс, который пришел на смену File. Работа с ним безопаснее и эффективнее.
 * <p>
 * Объект типа Path — это как продвинутая версия типа String — он не привязан к конкретному
 * файлу на диске: он просто хранит некий путь на диске и все.
 */
public class Path_Path {
    public static void main(String[] args) {
        Path file = Path.of("E:\\pushkin.txt"); //Путь к файлу
        Path directory = Path.of("E:\\Foto\\");  //Путь к директории
/**
 * Разделение пути на части
 * Метод getParent() возвращает путь, который указывает на родительскую директорию для текущего пути
 */
        String str = "c:\\windows\\projects\\note.txt";
        Path path = Path.of(str).getParent(); // "c:\\windows\\projects\\"
/**
 * * Метод getFileName() возвращает одно имя файла (или директории) — то,
 * что идет после последнего разделителя:
 */
        String str1 = "c:\\windows\\projects\\note.txt";
        Path path1 = Path.of(str1).getFileName();  //"note.txt"
        String str2 = "c:\\windows\\projects\\";
        Path path2 = Path.of(str2).getFileName();  //"projects"
/**
 * Метод getRoot() возвращает путь к корневой директории:
 */
        String str3 = "c:\\windows\\projects\\";  //"c:\\"

        /**
         * Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
         * после чего в консоли выводится диск (корень для Unix-like), на котором находится этот
         * файл (или папка).
         * Для решения задачи используй Path и его методы.
         */
        Scanner scanner = new Scanner(System.in);
//        String str4 = scanner.nextLine();
        //напишите тут ваш код

//        System.out.println(Path.of(str4).getRoot());

        /**
         *  Абсолютный и относительный пути.
         *  Абсолютный путь начинается с корневой директории. c:\
         *  Относительный путь считается относительно какой-то директории.
         *  Т.е. это как бы конец пути, но только без начала.
         *
         *  Метод boolean isAbsolute() проверяет, является ли текущий путь абсолютным.
         *
         */
        String str5 = "c:\\windows\\projects\\note.txt";
        boolean abs = Path.of(str).isAbsolute();    // true

        String str6 = "c:\\windows\\projects\\note.txt";
        boolean abs1 = Path.of(str).isAbsolute();   //false

        // Метод Path toAbsolutePath() - Превращает путь в абсолютный

        String str7 = "src\\com\\javarush\\Main.java";
        Path path7 = Path.of(str7).toAbsolutePath();
//        System.out.println(path7);

        //Метод Path resolve(Path other)Метод resolve() выполняет операцию, обратную relativize():
        // из абсолютного и относительного пути он строит новый абсолютный путь.

        Path path3 = Path.of("projects\\note.txt");
        Path path4 = Path.of("c:\\windows\\");
        Path result = path4.resolve(path3);
//        System.out.println(result);

        // Метод toURI() преобразует путь к стандарту URI
        Path path5 = Path.of("c:\\windows\\projects\\note.txt");
        URI ur = path5.toUri();
//        System.out.println(ur);

        /**
         * Path relativize(Path other)
         *
         * Метод relativize() позволяет вычислить «разницу путей»: один путь относительно другого
         */
        Path path11 = Path.of("c:\\windows\\projects\\note.txt");
        Path path22 = Path.of("c:\\windows\\");
        Path result11 = path22.relativize(path11);  //"projects\\note.txt"

        Path path111 = Path.of("c:\\windows\\projects\\note.txt");
        Path path222 = Path.of("c:\\windows\\");
        Path result111 = path1.relativize(path222);  //"..\\.."


/**
 * Напиши программу, которая будет считывать с клавиатуры два пути и выводить в консоль
 * относительный путь между первым и вторым путями, если он существует. В противном случае
 * выводить ничего не нужно.
 */
//        Scanner scanner1 = new Scanner(System.in);
//        String str33 = scanner.nextLine();
//        String str44 = scanner.nextLine();
//
//        Path path01 = Path.of(str33);
//        Path path02 = Path.of(str44);
//
//            try {
//                System.out.println(path01.relativize(path02));
//            } catch (Exception e){
//
//            }
        /**
         * Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
         * при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.

         */

        Scanner scanner9 = new Scanner(System.in);
        String str9 = scanner.nextLine();
        //напишите тут ваш код

        if (Path.of(str).isAbsolute()){
            System.out.println(str);
        } else
            System.out.println(Path.of(str).toAbsolutePath());
    }
}

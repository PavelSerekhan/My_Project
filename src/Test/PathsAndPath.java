package Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
Paths — это совсем простой класс с единственным статическим методом get().
Его создали исключительно для того, чтобы из переданной строки или URI получить объект типа Path.
Другой функциональности у него нет.
 */

/*
Path - переработанный аналог класса File. Работать с ним значительно проще чем с File.
 В классе File методы возвращали то String, то boolean, то File — разобраться было непросто.
 */
public class PathsAndPath {
    public static void main(String[] args) {
        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        Path fileName = testFilePath.getFileName();// возвращает имя файла из пути;
        System.out.println(fileName);

        Path parent = testFilePath.getParent(); //возвращает «родительскую» которая находится выше по дереву каталогов
        System.out.println(parent);

        Path root = testFilePath.getRoot();//возвращает «корневую» директорию
        System.out.println(root);

        boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
        //В метод endsWith() нужно передавать именно полноценный путь, а не просто набор символов
        System.out.println(endWithTxt);

        boolean startWithLalala = testFilePath.startsWith("lalalala");
        System.out.println(startWithLalala);

        System.out.println(testFilePath.isAbsolute());// абсолютный путь

        Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println(path6.normalize());//«нормализует» текущий путь, удаляя из него ненужные элементы

        Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
        Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");
    //relativize() вычисляет относительный путь между текущим и переданным путем
        System.out.println(testFilePath1.relativize(testFilePath2));
    }
}


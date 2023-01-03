package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson_Path {
    public static void main(String[] args) {
//        String str = "c:\\windows\\projects\\note.txt";
//        Path path = Path.of(str).getParent(); //указывает на родительскую директорию для текущего пути
//        System.out.println(path);
//
        String str1 = "c:\\windows\\projects\\";
        Path path1 = Path.of(str1).getParent();
        System.out.println(path1);
//
//        String str2 = "c:\\windows\\projects\\note.txt";
//        Path path2 = Path.of(str2).getFileName(); //возвращает одно имя файла,
//        // что идет после последнего разделителя
//        System.out.println(path2);
//        Path path3 = Path.of(str2).getRoot(); //возвращает путь к корневой директории
//        System.out.println(path3);

//        String str3 = "c:\\windows\\projects\\note.txt";
//        boolean abs = Path.of(str3).isAbsolute(); //возвращает true, если путь абсолютный
//        System.out.println(abs);
//
//        String str4 = "src\\com\\javarush\\Main.java";
//        boolean otn = Path.of(str4).isAbsolute();
//        System.out.println(otn);
//        Path path4 = Path.of(str4).toAbsolutePath(); //Превращает путь в абсолютный
//        System.out.println(path4);

//        Path path1 = Path.of("c:\\windows\\projects\\note.txt");
//        Path path2 = Path.of("c:\\windows\\");
//        Path result = path1.relativize(path2);
//        System.out.println(result);
//        Path result1 = path2.relativize(path1);
//        System.out.println(result1);


//        Path path = Path.of("c:\\windows\\");
//        Path path1 = Path.of("projects\\note.txt");
//        Path result = path.resolve(path1); //из абсолютного и относительного пути
//        // он строит новый абсолютный путь.
//        System.out.println(result);
//        Path result1 = path1.resolve(path);
//        System.out.println(result1);

//        String str = "C:\\Users\\ABUBAKR\\..\\dir.txt";
//        Path path = Path.of(str).normalize();//.. и это будет означать вернуться на одну директорию назад
//        Path path1 = Path.of(str);
//        System.out.println(path);
//        System.out.println(path1);

        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");
        //из переданной строки или URI получить объект типа Path

//        Path fileName = testFilePath.getFileName();  //имя файла
//        System.out.println(fileName);
//
//        Path parent = testFilePath.getParent();
//        //возвращает «родительскую» директорию, которая находится выше по дереву каталогов
//        System.out.println(parent);
//
//        Path root = testFilePath.getRoot();//корень
//        System.out.println(root);
//
//        boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
//        //проверяют, заканчивается ли путь с переданного пути:
//        System.out.println(endWithTxt);
//
//        boolean startWith = testFilePath.startsWith("laalala");
//        //проверяют, начинается ли путь с переданного пути:
//        System.out.println(startWith);

        System.out.println(testFilePath.isAbsolute());




    }
}

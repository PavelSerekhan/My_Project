package Test;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
/*
Его задачей является управление информацией о файлах и каталогах.

 у класса File был ряд недостатков. Например, в нем не было метода
 copy(), который позволил бы скопировать файл из одного места в другое
 */

public class File_File {
//    public static void main(String[] args) throws IOException {
//        // создаем объект File для каталога
//        File dir = new File("E://SomeDir");
//        // создаем объекты для файлов, которые находятся в каталоге
//        File file = new File("E://SomeDir", "Hello.txt");
//        File file1 = new File(dir, "Hello2.txt");
//// если объект представляет каталог
//        if (dir.isDirectory()) {
//            // получаем все вложенные объекты в каталоге
//            for (File item : dir.listFiles()) {
//                if (item.isDirectory()) {
//                    System.out.println(item.getName() + "\t folder");
//                } else {
//                    System.out.println(item.getName() + "\t file");
//                }
//            }
//        }

//        //ряд операций с каталогами, как удаление, переименование и создание:
//        File dir = new File("E://SomeDir//NewDir");
//        boolean created = dir.mkdir();//создает новый каталог(папку) и при удачном создании возвращает значение true
//        if (created)
//            System.out.println("Папка была создана!");
//        // переименуем каталог
//
//        File newDir = new File("E://SomeDir//NewDirRenamed");
//        boolean renameDir =  dir.renameTo(newDir);
//        if (renameDir)
//            System.out.println("Папка переименована!");
//
//        // удалим каталог
//        boolean deleted = newDir.delete();
//        if (deleted)
//            System.out.println("Папка удалена");


    //    получим данные по одному из файлов и создадим еще один файл:
//    public static void main(String[] args) {
//        // определяем объект для каталога
//        File myFile = new File("E://SomeDir//notes.txt");
//        System.out.println("File name: " + myFile.getName());
//        System.out.println("Parent folder: " + myFile.getParent());
//
//        if (myFile.exists()) {
//            System.out.println("File exists");
//        } else {
//            System.out.println("File not found");
//        }
//        System.out.println("File size: " + myFile.length()); //возвращает размер файла в байтах
//
//        if (myFile.canRead()) {
//            System.out.println("File can be read");
//        } else {
//            System.out.println("File can not be read");
//        }
//
//        if (myFile.canWrite()) {
//            System.out.println("File can be written");
//        } else {
//            System.out.println("File can not be written");
//        }
//
//        // создадим новый файл
//        File newFile = new File("E://SomeDir//MyFile");
//        //При создании нового файла метод createNewFile() в случае неудачи выбрасывает исключение
//        // IOException, поэтому нам надо его отлавливать
//        try {
//            boolean created = newFile.createNewFile();
//            if (created)
//                System.out.println("File has been created");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    // Как получить список всех файлов в директории и ее поддиректориях?
//    public static void main(String[] args) {
//        File file = new File("E://Books");
//        if (file.isDirectory()) {
//            for (File files : file.listFiles()) {
//                if (files.isDirectory()) {
//                    System.out.println(files);
//                }
//            }
//        }
    private static ArrayList<File> listWithFIleNames = new ArrayList<>();

    public static void main(String[] args) {
        getListFiles("E://Books");
        for (File fil : listWithFIleNames) {
            System.out.println(fil.getName());
        }
    }

    public static void getListFiles(String str) {
        File f = new File(str);
        for (File s : f.listFiles()) {
            if (s.isFile()) {
                listWithFIleNames.add(s);
            } else if (s.isDirectory()) {
                getListFiles(s.getAbsolutePath());//Возвращает полный путь файла со всеми поддиректориями.
            }
        }
    }
}





package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Для создания архива используется класс ZipOutputStream.
Для создания объекта ZipOutputStream в его конструктор передается поток вывода:
ZipOutputStream(OutputStream out).
Для записи файлов в архив для каждого файла создается объект ZipEntry, в конструктор которого
передается имя архивируемого файла.
А чтобы добавить каждый объект ZipEntry в архив, применяется метод putNextEntry().

 	Как заархивировать файл?
 */
public class Zip_Output_Stream {
//    public static void main(String[] args) {
//        String filename = "E://SomeDir//notes.txt";
//        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream
//                ("E://SomeDir//output.zip"));
//             FileInputStream fis = new FileInputStream(filename)) {
//            ZipEntry entry1 = new ZipEntry("notes.txt");
//            zout.putNextEntry(entry1);
//            // считываем содержимое файла в массив byte
//            byte[] buffer = new byte[fis.available()];
//            fis.read(buffer);
//            // добавляем содержимое к архиву
//            zout.write(buffer);
//            // закрываем текущую запись для новой записи
//            zout.closeEntry();
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

    //    Как разархивировать файл?
/*
Для чтения архивов применяется класс ZipInputStream.
В конструкторе он принимает поток, указывающий на zip-архив:ZipInputStream(InputStream in).
Для считывания файлов из архива ZipInputStream использует метод getNextEntry(),
который возвращает объект ZipEntry. Объект ZipEntry представляет отдельную запись в zip-архиве.
 */
    public static void main(String[] args) {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream
                ("E://SomeDir//output.zip"))){
        ZipEntry entry;
        String name;
        long size;
        while ((entry = zin.getNextEntry()) != null){
            name = entry.getName(); // получим название файла
            size = entry.getSize(); // получим его размер в байтах
            System.out.printf("File name: %s \t File size: %d \n" , name, size);
            //распаковка
            FileOutputStream fout = new FileOutputStream("E:\\somedir\\new" + name);
            for (int c = zin.read(); c != -1; c = zin.read()){
                fout.write(c);
            }
            fout.flush();
            zin.closeEntry();
            fout.close();
        }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}


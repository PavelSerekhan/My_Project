package Test;
/*
InputStream используется для побайтового чтения данных из некоторого ресурса,
а OutputStream — для побайтовой записи. Для упрощения таких байтовых записей
ввели BufferedOutputStream,
а для чтения BufferedInputStream. Эти классы являются не чем иным как буферами,
 накапливающими данные,
позволяющими работать с данными не побайтово, а целыми пакетами данных (массивами).
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Buffer_Input_Output_Stream {
    public static void main(String[] args) throws IOException {

//        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
//        byte[] arr = new byte[100];
//        bufferedInputStream.read(arr);

//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//
//        try(FileInputStream input = new FileInputStream(src);  // read
//        FileOutputStream output = new FileOutputStream(dest)) { //write
//
//            byte[] buffer = new byte[65536];  //Буфер, в который будем считывать данные
//            while (input.available() > 0){    // Метод возвращает количество байт, которое еще осталось в потоке
//                int real = input.read(buffer); //Считываем данные в буфер
//                output.write(buffer,0,real); //Записываем данные из буфера во второй поток
//            }
//        }

//        try (Scanner scanner = new Scanner(System.in);
//             var input = Files.newInputStream(Paths.get(scanner.nextLine()));
//             var output = Files.newOutputStream(Paths.get(scanner.nextLine()))) {

//        try(var input = Files.newInputStream(Paths.get("e:first.txt"));
//             var output = Files.newOutputStream(Paths.get("e:second.txt"))) {
//
//            byte[] bytesIn = input.readAllBytes();
//            byte[] bytesOut = new byte[bytesIn.length];
//
//            for (int i = 0; i < bytesIn.length; i += 2) {
//                if (i < bytesIn.length - 1) {
//                    bytesOut[i] = bytesIn[i + 1];
//                    bytesOut[i + 1] = bytesIn[i];
//                } else {
//                    bytesOut[i] = bytesIn[i];
//                }
//            }
//            output.write(bytesOut);
//
//        } catch (Exception e) {
//            System.out.println("Something went wrong: " + e);
//        }
//        //eHll!oI m'P vale !'Ista m na
//    }
        /**
         * byte[] buffer = new byte[1024];
         *             while (input.available() > 0) {
         *                 byte bit;
         *                 int read = input.read(buffer);
         *                 for (int i = 0; i < buffer.length; i+=2) {
         *                     bit = buffer[i];
         *                     buffer[i] = buffer[i + 1];
         *                     buffer[i + 1] = (byte) bit;
         *                 }
         *                 output.write(buffer, 0, read);
         *             }
         */

        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try (FileInputStream inputStream = new FileInputStream(src);
             FileOutputStream outputStream = new FileOutputStream(dest)) {

            byte[] buffer = new byte[65536];
            while (inputStream.available() > 0) {

                int real = inputStream.read(buffer); //Считываем данные в буфер
                outputStream.write(buffer,0,real); //Записываем данные из буфера во второй поток

            }
        }
    }
}

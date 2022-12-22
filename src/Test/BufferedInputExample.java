package Test;

import java.io.*;

public class BufferedInputExample {

    public static void main(String[] args) {
//        try (InputStream inputStream = new FileInputStream("E:source.txt");
//             BufferedInputStream buffer = new BufferedInputStream(inputStream)) {
//
//        while (buffer.available() > 0){
//            char c = (char)buffer.read(); //считываем байты из файла и преобразуем их в символы
//            System.out.println("Был прочитан символ " + c);
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try (FileOutputStream outputStream = new FileOutputStream("E:result.txt");
             BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream)){

            String text = "I love Java";

            byte[] buffer = text.getBytes();
            bufferedStream.write(buffer,0, buffer.length);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

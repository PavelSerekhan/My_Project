package Abstract;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        //Создаем поток-чтения-байт-из-файла
//        FileInputStream inputStream = new FileInputStream("E:data.txt");
//        // Создаем поток-записи-байт-в-файл
//        FileOutputStream outputStream = new FileOutputStream("E:/result.txt");
//        byte[] buffer = new byte[1000];
//        while (inputStream.available() > 0){ //пока есть еще непрочитанные байты
//            int count = inputStream.read(buffer); // прочитать очередной байт в переменную data
//            outputStream.write(buffer,0,count);  //записать блок(часть блока) во второй поток
//            inputStream.close();
//            outputStream.close();
//        }
        try (FileInputStream inputStream = new FileInputStream("E:/data.txt");
             FileOutputStream outputStream = new FileOutputStream("E:/result.txt")) {

            byte[] buffer = new byte[1000];
            while (inputStream.available() > 0) {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
        }
    }
}

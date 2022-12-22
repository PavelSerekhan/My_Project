package Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class TryWithResources {
    /**
     * У классов, которые используют внешние ресурсы, есть специальный метод для их
     * освобождения — close(). После работы с файлом (или другим внешним ресурсом) вы должны
     * вызвать у объекта, связанного с внешним ресурсом, метод close().
     * Однако в процессе работы программы могут возникнуть исключения, и внешний ресурс
     * так и не будет освобожден.
     * <p>
     * у оператора try-with-resources можно дописывать блоки catch и finally.
     * А можно и не добавлять, если в них нет необходимости.
     *
     *
     *
     * В блоке try выполняется код который может вызвать исключения
     * В блоке catch описывается какие будем искать исключения и что с ними делать
     */

    public static void main(String[] args) throws IOException {

//        String path = "c:\\projects\\log.txt";
//
//        try (FileOutputStream outputStream = new FileOutputStream(path)) {
//            outputStream.write(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            Scanner scanner = new Scanner(System.in);
//            String line = scanner.nextLine();
//            System.out.println(line.toUpperCase());
//            scanner.close();
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }


//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//
//        try (FileInputStream input = new FileInputStream(src);
//             FileOutputStream output = new FileOutputStream(dest)) {
//
//            byte[] buffer = input.readAllBytes();
//            output.write(buffer);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (Scanner scanner = new Scanner(System.in);
//             BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))){
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }

//
    }
}

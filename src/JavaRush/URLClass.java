package JavaRush;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class URLClass {
    /**
     * Получение странички из интернета
     */
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://javarush.ru");   //Создает объект URL с путем к странице
//        InputStream input = url.openStream();    //Получает InputStream у интернет-объекта
//        byte[] buffer = input.readAllBytes(); //Читает все байты и возвращает массив байт
//        String str = new String(buffer);   // Преобразуем массив в строку
//        System.out.println(str);


        /**
         * Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете,
         * скачивать его и сохранять во временный файл.
         * Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files,
         * а также метод openStream() класса URL.
         */

//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        //напишите тут ваш код
//
//        URL url = new URL(line);
//        InputStream inputStream = url.openStream();
//        byte[] buffer = inputStream.readAllBytes();
//        Path path = Files.createTempFile(null,null);
//        Files.write(path, buffer);

        /**
         * Класс URLConnection
         */

//        URL url = new URL("https://javarush.ru");  //Создаем объект URL с путем к странице
//        URLConnection connection = url.openConnection(); //Создаем двустороннее соединение
//
//        //получили поток для отправки данных
//        OutputStream output = connection.getOutputStream(); //Получаем поток вывода
//        output.write(1); //отправляем данные             //Выводим в него данные
//
//        // получили поток для чтения данных
//        InputStream input = connection.getInputStream();  // Получаем поток ввода
//        int data = input.read();    //читаем данные, читаем из него данные

//        URL url = new URL("https://javarush.ru");
//        URLConnection connection = url.openConnection();
//        // отправляем данные
//        try (OutputStream output = connection.getOutputStream();
//             PrintStream printStream = new PrintStream(output)) {
//            printStream.println("Привет");
//        }
//        //читаем данные
//        try(InputStream input = connection.getInputStream();
//            BufferedReader buffer = new BufferedReader(new InputStreamReader(input))){
//            while (buffer.ready()){
//                System.out.println(buffer.readLine());
//            }
//        }

        /**
         * Примеры работы с сетью
         */

//        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
//        URL url = new URL(image);
//        InputStream inpit = url.openStream();
//        Path path = Path.of("e:\\Google.png");
//        Files.copy(inpit,path);
        /**
         * Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
         * Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и выводить их на экран.
         *
         * Подсказки:
         *
         * Используй метод openConnection() класса URL.
         * Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
         * Если не знаешь, какой API использовать, бери http://httpbin.org/post.
         */

        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream outputStream = connection.getOutputStream();
             PrintStream stream = new PrintStream(outputStream)) {
            stream.println("Hello");
        }
        try(InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}

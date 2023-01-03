package com.company;

import java.io.*;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;

public class Lesson_URI {
    public static void main(String[] args) throws URISyntaxException, IOException {

//        URI url = new URI("https://www.youtube.com/");//создаем обьект URL с путем к странице
//        InputStream input = url.toURL().openStream();//Получает InputStream у интернет-объекта
//        byte[] buffer = input.readAllBytes();//Читает все байты и возвращает массив байт
//        String str = new String(buffer);//Преобразуем массив в строку
//        System.out.println(str);//Выводим строку на экран
//        //отобразится содержимое HTML-страницы

        //работа с файлом
//        File file = new File("e:\\readmy.txt");
//        InputStream input = new FileInputStream(file);
//        byte[] buffer = input.readAllBytes();
//        String str = new String(buffer);
//        System.out.println(str);

//        //работа с интернетом
//        URI uri = new URI("https://javarush.ru");//создаем обьект URL с путем к странице
//        InputStream input = uri.toURL().openStream();//Получает InputStream у интернет-объекта
//        byte[] buffer = input.readAllBytes();//Читает все байты и возвращает массив байт
//        String str = new String(buffer);//Преобразуем массив в строку
//        System.out.println(str);
//        //отобразится содержимое HTML-страницы

//        URI uri = new URI("https://javaruh.ru");//Создали объект URI с путем к странице
//        URLConnection connection = uri.toURL().openConnection();//создаем двусторонее соединение
//        // получили поток для отправки данных
//        OutputStream output = connection.getOutputStream();//получаем поток вывода
//        output.write(1);//отправляем данные
//        // получили поток для чтения данных
//        InputStream input = connection.getInputStream();//получаем поток ввода
//        int data = input.read();//читаем из него данные
//        System.out.println(data);

        URI uri = new URI("https://javarush.ru");
        URLConnection connection = uri.toURL().openConnection();

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)){
            sender.println("Hello");
        }
        try(InputStream input = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input))){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        }

    }
}

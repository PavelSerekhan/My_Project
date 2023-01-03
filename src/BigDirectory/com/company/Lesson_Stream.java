package com.company;

import java.io.*;
import java.util.Scanner;

public class Lesson_Stream {
    public static void main(String[] args) throws IOException {
//        String path = "c:\\projects\\log.txt";  //путь к файлу
//        FileOutputStream output = new FileOutputStream(path);  //Получаем обьект файла:
//        // захватываем ресурс
//        output.write(1); //пишем в файл
//        output.close(); // закрываем файл - освобождаем ресурс


//        String path = "c:\\projects\\log.txt";  //путь к файлу
//        FileOutputStream output = null;
//        try {
//            output = new FileOutputStream(path);
//            output.write(1);
//        } finally {
//            if (output != null)
//                output.close();
//        }

//        String path = "c:\\projects\\log.txt";  //путь к файлу
//        try (FileOutputStream output = new FileOutputStream(path)){
//            output.write(1);
//        }

//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//        try (FileInputStream inputStream = new FileInputStream(src);
//             FileOutputStream outputStream = new FileOutputStream(dest)) {
//            byte[] buffer = inputStream.readAllBytes();
//            outputStream.write(buffer);
//        }

//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//        try (FileInputStream inputStream = new FileInputStream(src); //для чтения из файла
//             FileOutputStream outputStream = new FileOutputStream(dest)) { // для записи в файл
//            byte[] buffer = new byte[65536]; // буфер в который будем считывать данные
//            while (inputStream.available() > 0) { //Пока данные есть в потоке
//                int real = inputStream.read(buffer); //Считываем данные в буфер
//                outputStream.write(buffer,0,real);
//            }
//        }


//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//        try (FileReader reader = new FileReader(src);    //Reader для чтения из файла
//             FileWriter writer = new FileWriter(dest)) { //Writer для записи в файл
//            char[] buffer = new char[65536];          //Буфер, в который будем считывать данные
//            while (reader.ready()) {                  //Пока данные есть в потоке
//                int real = reader.read(buffer);       // Читаем данные в буфер
//                writer.write(buffer, 0, real);   //Записываем данные из буфера во второй поток
//            }
//        }

//        String src = "c:\\projects\\log.txt";
//        FileInputStream input = new FileInputStream(src);
//        InputStreamReader reader = new InputStreamReader(input);  //промежуточный поток

//        String src = "c:\\projects\\log.txt";
//        try (FileReader in = new FileReader(src);//Создаем объект FileReader,источник данных—файл.
//             BufferedReader reader = new BufferedReader(in)) { //Создаем объект BufferedReader,
//            // источник данных — объект FileReader;
//            while (reader.ready()) {             //пока в reader еще есть данные
//                String line = reader.readLine();   //Прочитать одну линию
//                System.out.println(line);          //Вывести линию на экран
//            }
//        }


//        InputStream stream = System.in;
//        InputStreamReader reader = new InputStreamReader(stream);
//        BufferedReader buff = new BufferedReader(reader);
//        String line = buff.readLine();
//        System.out.println(line);

//        Scanner  scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        System.out.println(line);

//        String src = "c:\\projects\\log.txt";  //путь к файлу
//        String dest = "c:\\projects\\copy.txt";  //путь к файлу
//        try (FileInputStream input = new FileInputStream(src); //InputStream для чтения из файла
//             FileOutputStream output = new FileOutputStream(dest)) {//OutputStream для записи в файл
//            byte[] buffer = new byte[65536]; //Буфер, в который мы будем считывать данные
//            while (input.available() > 0){ //Пока данные есть в потоке
//                int real = input.read(buffer);  //Считываем данные в буфер
//                output.write(buffer,0,real); //Записываем данные из буфера во второй поток
//            }
//        }

        StringWriter writer = new StringWriter();
        writer.write("Hello");
        writer.write(String.valueOf(2));
        writer.write("Mr.President");
        System.out.println(writer.toString());

    }
}

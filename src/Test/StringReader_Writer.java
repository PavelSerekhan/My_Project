package Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
String Reader and Writer читает(записывает) символы!
Эти классы – это простейшие реализации абстрактных классов Reader и Writer. И практически аналоги
FileReader и FileWriter. Но, в отличие от них, они работают не с данными в файле на диске, а со
строкой (String) находящейся в памяти Java-машины.
StringReader – это, фактически, переходник между классом String и Reader.
 А StringWriter – это строка, которая унаследована от Writer.

 Например, ты хочешь проверить, как работает твой метод, который должен вычитывать
  данные из переданного в него объекта Reader.

 */

public class StringReader_Writer {

//    public static void main(String[] args) throws IOException {
//        //Чтение из объекта reader:
//
//        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
//
//        //это строчка – ключевая: мы «превратили» строку в Reader
//
//        StringReader reader = new StringReader(test);
//        executor(reader);// исполнитель с англ.
//    }
//    public static void executor(Reader reader) throws IOException {
//        BufferedReader br = new BufferedReader(reader);
//        String line;
//        while ((line = br.readLine()) != null){
//            System.out.println(line);
//        }
//        //мы просто взяли строку, обернули ее в StringReader и передали вместо объекта Reader!
//
//    }
    //Теперь он будет не просто читать строки, и выводить их на экран, а разворачивать их задом
    // наперед и выводить в объект writer.

    //Чтение из объекта reader и запись в объект writer:


//    public static void main(String[] args) throws IOException {
        //эту строку должен будет прочитать Reader
//        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
//
//        //заворачиваем строку в StringReader
//        StringReader reader = new StringReader(test);
//
//        //Создаем объект StringWriter
//        StringWriter writer = new StringWriter();
//
//        //переписываем строки из Reader во Writer, предварительно развернув их
//        executor(reader, writer);
//
//        //получаем текст, который был записан во Writer
//        String result = writer.toString();
//
//        //выведем полученный из Writer’а текст на экран
//        System.out.println("Результат: "+result);
//    }
//    public static void executor(Reader reader, Writer writer) throws IOException {
//        BufferedReader br = new BufferedReader(reader);
//        String line;
//        //читаем строку из Reader’а
//        while ((line = br.readLine()) != null){
//            //разворачиваем строку задом наперед
//            StringBuilder sb = new StringBuilder(line);
//            String newLine = sb.reverse().toString();
//
//            //пишем строку в Writer
//            writer.write(newLine);
//
//        }

//        byte[] bytes = args[0].getBytes();
//        try (InputStream stream = System.in;
//             Scanner scanner = new Scanner(stream);
//             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
//
//            bufferedWriter.write(Path.of(bytes));
//        } catch (IOException e) {
//            System.out.println("Something went wrong: " + e);
//        }

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        try (PrintStream stream = new PrintStream(baos)){
//            stream.println("Hello");
//            stream.println(123);
//        }
//        String result = baos.toString();
//        System.out.println(result);


    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        //напишите тут ваш код

        for (int i = outputStream.size() -1 ; i < outputStream.size(); i++) {


        }

    }
    public static void printSomething(String str) {
        stream.print(str);
    }
}

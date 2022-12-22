package Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
В конструктор объекта BufferedReader обязательно нужно передать объект Reader, из которого он
будет читать данные. Объект BufferedReader читает из Reader’а данные большими кусками и хранит
их у себя внутри в буфере. Поэтому чтение из пары BufferedReader+Reader быстрее, чем прямо из Reader.

BufferedWriter, при записи в него, сохраняет переданные данные во внутреннем буфере, а когда
буфер заполняется – пишет данные во Writer одним большим куском. Это гораздо быстрее.
После окончания записи у объекта BufferedWriter надо вызвать метод flush(), чтобы он записал
данные из буфера во Writer, которые еще не записаны, т.е. буфер не заполнен до конца.
 */
public class BufferedReader_Writer {
//    public static void main(String[] args) throws IOException {
//        String test = "Hi!\n My names is Pavel\n I'm a photographer\n";
//        StringReader reader = new StringReader(test);
//        StringWriter writer = new StringWriter();
//        executor(reader,writer);
//        String result = writer.toString();
//        System.out.println("Результат: " + result);
//    }
//    public static void executor(Reader reader, Writer writer) throws IOException {
//        BufferedReader br = new BufferedReader(reader);
//        String line;
//        while ((line = br.readLine()) != null){
//            writer.write(line + '\n');
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        String test = "Hi!\n My name is Richard\n I'm a photographer\n";
//        InputStream inputStream = new ByteArrayInputStream(test.getBytes());//считывает байты из
//        // массива байт
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//пишет байты в массив
//        // байт у него внутри
//        executor(inputStream, outputStream);
//        String result = new String(outputStream.toByteArray());
//        System.out.println("Результат: " + result);
//    }
//
//    public static void executor(InputStream inputStream, OutputStream outputStream) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(inputStream);
//        while (bis.available() > 0){
//            int data = bis.read();
//            outputStream.write(data);
//        }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("E:pushkin.txt"))) {

            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        }
    }
}

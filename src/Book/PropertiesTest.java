package Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {

        Properties properties = new Properties();
//        properties.setProperty("Key00", "Value00");
//        properties.setProperty("Key11", "Value11");
//
//        try(FileOutputStream fos = new FileOutputStream("./src/Book/file.property")){
//            properties.store(fos, "MyComment"); // для сохранения в файле
//        } catch  (IOException e) {
//            e.printStackTrace();
//        }

        try(FileInputStream fis = new FileInputStream("./src/Book/file.property")){
            properties.load(fis); // загрузка из файла

            String learn = properties.getProperty("Key00");
            System.out.println(learn);

            System.out.println(properties.getProperty("Key11"));
        } catch  (IOException e) {
            e.printStackTrace();
        }
    }
}

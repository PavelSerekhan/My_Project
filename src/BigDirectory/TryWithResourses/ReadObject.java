package TryWithResourses;
/**
 * try with resourses поток закрывается автоматически!
 * реализует интерфейс closeable
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//            Person person1 = (Person) ois.readObject();
//            System.out.println(person1);
//
//        ois.close();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


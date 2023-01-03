package TryWithResourses;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * try with resourses поток закрывается автоматически!
 * реализует интерфейс closeable
 */
public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");

//        try {
//            FileOutputStream fos = new FileOutputStream("people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(person1);
//            oos.close();

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

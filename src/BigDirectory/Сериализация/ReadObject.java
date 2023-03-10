package Сериализация;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

//          1ый способ чтения массива объектов
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

//        2ый способ чтения массива объектов

            Person[] person = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(person));

//       Чтение по объектам
//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
//            System.out.println(person1);
//            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


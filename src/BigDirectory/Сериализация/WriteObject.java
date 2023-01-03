package Сериализация;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
//        Person person1 = new Person(1, "Bob");
//        Person person2 = new Person(2, "Mike");
        Person[] people = {new Person(1, "Bob"),new Person(2, "Mike"),
                new Person(3, "Tom")};


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//        1 ый способ записи массива объектов
//            oos.writeInt(people.length);
//            for(Person person : people){
//                oos.writeObject(person);
//            }

//        2 ый способ записи массива объектов
            oos.writeObject(people);

            //Запись по объектам
//            oos.writeObject(person1);
//            oos.writeObject(person2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

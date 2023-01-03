package Lessom_1_Level_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\saves.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        UserInfo userInfo = new UserInfo("Ivan", "Ivanov",
                "Ivan Ivanov's passport data");
        objectOutputStream.writeObject(userInfo);
//        System.out.println(userInfo);
        objectOutputStream.close();


    }
}

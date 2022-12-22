package Lessom_1_Level_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainMain2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("E:\\saves.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);
        objectInputStream.close();

    }
}

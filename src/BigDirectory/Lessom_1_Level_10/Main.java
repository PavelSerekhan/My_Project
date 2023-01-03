package Lessom_1_Level_10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //создаем наш объект
//        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
//        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
//        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};
//
//        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);
//        //создаем 2 потока для сериализации объекта и сохранения его в файл
//        FileOutputStream outputStream = new FileOutputStream("E:\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        // сохраняем игру в файл
//        objectOutputStream.writeObject(savedGame);
//        //закрываем поток и освобождаем ресурсы
//        objectOutputStream.close();


        FileInputStream inputStream = new FileInputStream("E:\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        SavedGame savedGame = (SavedGame) objectInputStream.readObject();
        System.out.println(savedGame);



    }
}

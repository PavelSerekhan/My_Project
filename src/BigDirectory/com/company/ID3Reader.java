package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ID3Reader {
    public static void main(String[] args) {
        File song = new File(args[0]);
        try (FileInputStream file = new FileInputStream(song)) {
            int size = (int) song.length();
            file.skip(size - 128);
            byte[] last128 = new byte[128];
            file.read(last128);
            String id3 = new String(last128);
            String tag = id3.substring(0, 3);
            if (tag.equals("TAG")) {
                System.out.println("Название: " +
                        id3.substring(3, 32));
                System.out.println("Исполнитель: " +
                        id3.substring(33, 62));
                System.out.println("Альбом: " +
                        id3.substring(63, 91));
                System.out.println("Год: " +
                        id3.substring(93, 97));
            } else {
                System.out.println(args[0] + " не содержит " +
                        "информацию ID3");
            }
            file.close();
        } catch (IOException ioException) {
            System.out.println("Ошибка -- " + ioException.toString());
        }
    }
}

package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreateFiles {
    public static void main(String[] args) throws IOException {
//        Path testFile1 = Files.createFile(Paths.get("e:testFile1.txt"));
//        System.out.println("Был ли файл успешно создан?");
//        System.out.println(Files.exists(Paths.get("e:testFile1.txt")));
//
//        Path testDirectory = Files.createDirectory(Paths.get("e:\\testDirectory"));
//        System.out.println("Была ли директория успешно создана?");
//        System.out.println(Files.exists(Paths.get("e:\\testDirectory")));

//        List<String> lines = Files.readAllLines(Paths.get("e:\\pushkin.txt"));
//        for (String s : lines){
//            System.out.println(s);
//        }


        Path creatFile = Files.createFile(Path.of("e:\\readmy.txt"));
//        Path creatDirectory = Files.createDirectory(Path.of("e:\\test"));
        Path creatDirectories = Files.createDirectories(Path.of("e:\\test\\3\\2\\1"));

        String iks = "e:\\readmy.txt";
        FileOutputStream output = new FileOutputStream(iks);
        String iks1 = "Hello, I'm Pavel!";
        output.write(iks1.getBytes());
        output.close();



    }
}

package com.company;

import java.io.*;


public class OutputStream {
    public static void main(String[] args) throws IOException {
//        String src = "e:\\test.txt";
//        FileOutputStream fileOutputStream = new FileOutputStream(src);
//        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех," +
//                " кто хочет стать программистом!";
//        fileOutputStream.write(greetings.getBytes());
//        fileOutputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream("e:text.txt");
        String greetings = "So close no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n";
        fileOutputStream.write(greetings.getBytes());
        fileOutputStream.close();

        FileInputStream inputStream = new FileInputStream("e:text.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream,200);
        int i;
        while ((i = inputStream.read())!= -1){
            System.out.print((char) i);
        }

    }
}

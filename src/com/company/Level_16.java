package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Level_16 {
    public static void main(String[] args) throws IOException {
//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//
//        try (FileInputStream input = new FileInputStream(src);
//             FileOutputStream output = new FileOutputStream(dest)){
//
//            byte[] buffer = new byte[65536];
//            while (input.available() > 0){
//                int real = input.read(buffer);
//                output.write(buffer,0, real);
//            }
//        }

//        String src = "c:\\projects\\log.txt";
//        String dest = "c:\\projects\\copy.txt";
//
//        try (FileReader reader = new FileReader(src);
//             FileWriter writer = new FileWriter(dest)) {
//
//            char[] buffer = new char[65536];
//            while (reader.ready()) {
//                int real = reader.read(buffer);
//                writer.write(buffer, 0, real);
//            }
//        }

//        String src = "c:\\projects\\log.txt";
//        try (FileReader in = new FileReader(src);
//             BufferedReader reader = new BufferedReader(in)) {
//            while (reader.ready()) {
//                String line = reader.readLine();
//                System.out.println(line);
//            }
//
//        }

//        InputStream stream = System.in;
//        InputStreamReader reader = new InputStreamReader(stream);
//        BufferedReader buff = new BufferedReader(reader);
//        String line = buff.readLine();
//        System.out.println(line);

//        StringWriter writer = new StringWriter();
//        writer.write("Hello");
//        writer.write(String.valueOf(123));
//        writer.write(121289);
//
//        String result = writer.toString();
//        System.out.println(result);

//        PrintStream stream = System.out;
//        stream.println("Hello!");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (PrintStream stream = new PrintStream(baos)){
            stream.println("Hello");
            stream.println(123);
        }
        String result = baos.toString();
        System.out.println(result);




    }
}

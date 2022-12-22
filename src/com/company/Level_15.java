package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Level_15 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
            e.printStackTrace();
        } finally {
            System.out.println("А вот и блок finally!");
        }
//        test();
    }

//    public static void test() {
//        Thread current = Thread.currentThread();
//        StackTraceElement[] methods = current.getStackTrace();
//        for(StackTraceElement info: methods)
//        {
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//
//            System.out.println(info.getFileName());
//            System.out.println(info.getLineNumber());
//
//            System.out.println(info.getModuleName());
//            System.out.println(info.getModuleVersion());
//            System.out.println();
//        }
}


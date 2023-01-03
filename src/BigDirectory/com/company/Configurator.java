package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class Configurator {
    public Configurator(){
        try{
            //Загрузка файла свойств
            File configFile = new File("program.properties");
            FileInputStream inStream = new FileInputStream(configFile);
            Properties config = new Properties();
            config.load(inStream);

            //Создание нового свойства
            Date current = new Date();
            config.setProperty("runtime",current.toString());

            //Сохранение файла свойств
            FileOutputStream outStream = new FileOutputStream(configFile);
            config.store(outStream, "Properties settings");
            inStream.close();
            config.list(System.out);
        }catch (IOException ioe) {
            System.out.println("Ошибка ввода/вывода " + ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        new Configurator();
    }
}

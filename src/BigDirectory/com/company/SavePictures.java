package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class SavePictures {
    public static void main(String[] args) throws IOException {
        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        //ссылка на URL адрес
        URL uri = new URL(image); //Создали объект URI с путем к странице
        InputStream input = uri.openStream();//получаем inputStream у интернет-объекта

        Path path = Path.of("e:\\CoohleLogo.png");// хранит путь к ресурсу в файловой системе
        Files.copy(input,path);//copy is input in path



    }
}

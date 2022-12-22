package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class ServerCheck {
    public ServerCheck(){
        String[] sites = {
                "https:apple.com",
                "https:microsoft.com",
                "https:compaq.com",
                "https:hp.com",
                "https:oracle.com",
                "https:informit.com"
        };
        try {
            load(sites);
        }catch (URISyntaxException oops){
            System.out.println("Неподходящий URI: " + oops.getMessage());
        }catch (IOException | InterruptedException oops){
            System.out.println("Ошибка: " + oops.getMessage());
        }
    }
    public void load(String[] sites) throws URISyntaxException,IOException,InterruptedException{
        for (String site : sites){
            System.out.println("\nСайт: " + site);
            //Создание веб-клиента(объекта браузера)
            HttpClient browser = HttpClient.newHttpClient();
            //Создание запроса к сайту
            URI uri = new URI(site);
            HttpRequest.Builder bob = HttpRequest.newBuilder(uri);
            HttpRequest request = bob.build();
            //Отправка запроса
//            HttpResponse<String> response = browser.send(request,
//                    HttpResponse.BodyHandler.asString());
            //Поиск заголовка сервера
//            HttpHeaders headers = response.headers();
//            Optional<String> server = headers.firstValue("Server");
//            if (server.isPresent()){
//                System.out.println("Сервер: " + server.get());
//            }else {
//                System.out.println("Сервер не идентифицирован ");
            }
        }
//    }

    public static void main(String[] args) {
        new ServerCheck();
    }
}

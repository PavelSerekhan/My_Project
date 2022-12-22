package com.company;

import java.io.*;

public class Print_Stream {

//    private static final String GREETINGS_MESSAGE = "My names is %s, my age is %d!";

    public static void main(String[] args) throws IOException {
//        PrintStream filePrintStream = new PrintStream("e:\\Print.txt");
//        filePrintStream.println("Hello");
//        filePrintStream.println("I'm ROBOT");
//        filePrintStream.printf(GREETINGS_MESSAGE,"Amigo",18);
//        filePrintStream.printf(GREETINGS_MESSAGE,"R2-D2",12);
//        filePrintStream.printf(GREETINGS_MESSAGE,"Ivan",33);

        String  greetings = "Привет! Меня зовут Амиго!\n" +
                "Я изучаю Java на сайте JavaRush.\n" +
                "Однажды я стану крутым программистом!\n";
        byte[] bytes = greetings.getBytes();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.setIn(inputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine())!= null){
            System.out.println(str);
        }




    }
}

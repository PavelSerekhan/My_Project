package Lessom_1_Level_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Dog {
    String name;
    int age;

    public void save(PrintWriter writer) throws IOException {
        writer.println(name);
        writer.println(age);
        writer.flush();
    }

    public void load(BufferedReader reader) throws IOException {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());

    }

}

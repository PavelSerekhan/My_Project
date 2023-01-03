package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ConfigWriter {
    String newline = System.getProperty("line.separator");

    public ConfigWriter() {
        try {
            File file = new File("program.properties");
            FileOutputStream fileStream = new FileOutputStream(file);
            write(fileStream, "username = max");
            write(fileStream, "score = 12550");
            write(fileStream, "level = 5");
            fileStream.close();
        } catch (IOException ioException) {
            System.out.println("Невозможно записать файл");
        }
    }

    void write(FileOutputStream stream, String output) throws IOException {
        output = output + newline;
        byte[] data = output.getBytes();
        stream.write(data, 0, data.length);

    }

    public static void main(String[] args) {
        new ConfigWriter();
    }
}

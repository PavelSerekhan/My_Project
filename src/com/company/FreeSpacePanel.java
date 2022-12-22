package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FreeSpacePanel extends Panel {
    JLabel spaceLabel = new JLabel("Объем диска: ");
    JLabel space = new JLabel();

    public FreeSpacePanel(){
        super();
        add(spaceLabel);
        add(space);
        try{
            setValue();
        }catch (IOException ioe){
            space.setText("Ошибка");
        }
    }
    private final void setValue() throws IOException{
        //Получение сведений о хранилище
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        //Определение свободного места в хранилище
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        //Вычисление объема в%
        double percent = (double) freeSpace / (double) totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        //Настройка текста метки
        space.setText(getValueWithCommas(freeSpace) + " свободно из "
                + getValueWithCommas(totalSpace) + " (" + percent + "%)");
    }
    private String getValueWithCommas(long value) {
        String input = "" + value;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if ((input.length()- i) % 3 == 0) {
                /* The mod operator % produces the remainder of a division,
                   so it can be used to display a comma preceding the 3rd
                   digit, 6th digit, 9th digit and so on. */
                output.append(",");
            }
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}

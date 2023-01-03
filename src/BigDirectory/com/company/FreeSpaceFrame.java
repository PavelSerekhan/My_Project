package com.company;

import javax.swing.*;
import java.awt.*;

public class FreeSpaceFrame extends JFrame {
    public FreeSpaceFrame(){
        super("Свободное пространство на диске");
        setLookAndFeel();
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel freePanel = new FreeSpacePanel();
        add(freePanel);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        }catch (Exception exc){
            //игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        new FreeSpaceFrame();
    }
}

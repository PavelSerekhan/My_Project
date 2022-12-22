package com.company;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JFrame {
    public TextArea(){
        super("Text Area");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,400);

        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        JTextArea area = new JTextArea("У меня есть \n пара перчаток",5,30);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        add(area);

        JScrollPane scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll);

        setVisible(true);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        new TextArea();
    }
}

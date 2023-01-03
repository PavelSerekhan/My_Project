package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Crisis2 extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis2() {
        super("Crisis2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(348,128);
        setLookAndFeel();

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();

        FlowLayout flo = new FlowLayout();
        BorderLayout bord = new BorderLayout();

        setLayout(flo);
        panel.setLayout(flo);
        panel1.setLayout(bord);

        panicButton = new JButton("Тревога");
        dontPanicButton = new JButton("Не паникуйте");
        blameButton = new JButton("Виноваты другие");
        mediaButton = new JButton("Исвестите СМИ");
        saveButton = new JButton("Спасите себя");

        panel.add(panicButton);
        panel.add(dontPanicButton);
        add(panel);

        panel1.add(blameButton,BorderLayout.NORTH);
        panel1.add(mediaButton,BorderLayout.CENTER);
        panel1.add(saveButton,BorderLayout.SOUTH);
        add(panel1);


        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.numbus.NimbusLookAndFeel"
            );
        }catch (Exception exc){

        }
    }

    public static void main(String[] args) {
        new Crisis2();
    }
}

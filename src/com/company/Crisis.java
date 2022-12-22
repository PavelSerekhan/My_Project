package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis(){
        super("Crisis");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(348,128);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
//        GridLayout grid = new GridLayout(2,3);
//        setLayout(grid);
//       2 BorderLayout flo = new BorderLayout();
//        setLayout(flo);

//        JPanel pane = new JPanel();
//        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
//        pane.setLayout(box);


        panicButton = new JButton("Тревога");
        dontPanicButton = new JButton("Не паникуйте");
        blameButton = new JButton("Виноваты другие");
        mediaButton = new JButton("Исвестите СМИ");
        saveButton = new JButton("Спасите себя");

//        pane.add(panicButton);
//        pane.add(dontPanicButton);
//        pane.add(blameButton);
//        pane.add(mediaButton);
//        pane.add(saveButton);
//        add(pane);

//       2 add(panicButton, BorderLayout.NORTH);
//        add(dontPanicButton, BorderLayout.SOUTH);
//        add(blameButton, BorderLayout.EAST);
//        add(mediaButton, BorderLayout.WEST);
//        add(saveButton, BorderLayout.CENTER);

        add(panicButton);
        add(dontPanicButton);
        add(blameButton);
        add(mediaButton);
        add(saveButton);
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
        new Crisis();
    }
}

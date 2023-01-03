package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class CIki extends JFrame {
    public CIki() {
        super("Window");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,200);


        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JLabel label = new JLabel("Веб-адрес: ", JLabel.LEFT);
        add(label);
        JTextField text = new JTextField(20);
        add(text);
        JButton button = new JButton("Поиск");
        add(button);

        setVisible(true);


    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swind.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        new CIki();
    }
}

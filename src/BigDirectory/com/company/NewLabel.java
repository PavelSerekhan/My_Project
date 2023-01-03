package com.company;

import javax.swing.*;
import java.awt.*;

public class NewLabel extends JFrame {
    public NewLabel() {
        super("New Label");
        setLookAndFeel();
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        JLabel label = new JLabel("Адрес Веб-страницы: ", JLabel.RIGHT);
        add(label);
        JTextField text = new JTextField(20);
        add(text);

        setVisible(true);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        new NewLabel();
    }

}

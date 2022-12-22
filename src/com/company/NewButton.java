package com.company;

import javax.swing.*;
import java.awt.*;

public class NewButton extends JFrame {
    public NewButton() {
        super("New Button");
        setLookAndFeel();
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flo = new FlowLayout();
        setLayout(flo);

        JButton button = new JButton("Воспроизвести");
        JButton button1 = new JButton("Остановка");
        JButton button2 = new JButton("Пауза");
        button.setEnabled(true);
        add(button);
        add(button1);
        add(button2);

        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {
        }
    }

    public static void main(String[] args) {
        new NewButton();
    }
}


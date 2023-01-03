package com.company;

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JFrame {
    public ComboBox(){
        super("ComboBox");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,200);

        JComboBox profession = new JComboBox();
        FlowLayout flo = new FlowLayout();
        profession.addItem("Мясник");
        profession.addItem("Диана");
        profession.addItem("Вика");
        profession.addItem("Полина");

        profession.setEditable(true);// чтобы сам мог ввести текст!

        setLayout(flo);
        add(profession);

        setVisible(true);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {
        }
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}

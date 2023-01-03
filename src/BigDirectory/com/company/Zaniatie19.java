package com.company;

import javax.swing.*;
import java.awt.*;

public class Zaniatie19 extends JFrame {
    public Zaniatie19(){
        super("Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,100);
        setLookAndFeel();
        JButton previousButton = new JButton("Назад");
        JButton nextButton = new JButton("Далее");
        JButton finishButton = new JButton("Готово");
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        previousButton.setEnabled(false);
        add(previousButton);
        add(nextButton);
        add(finishButton);
        setVisible(true);
        
    }

    private void setLookAndFeel() {
    }

    public static void main(String[] args) {
        new Zaniatie19();
    }
}

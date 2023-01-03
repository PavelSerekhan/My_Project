package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewColorFrame extends JFrame {
    JButton red, green, blue, yellow,pink;

    public NewColorFrame() {
        super("NewColorFrame");
//        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();// создание менеджера компоновки(расположение кнопок)
        setLayout(flo);
        red = new JButton("Красный");
        add(red);
        green = new JButton("Зеленый");
        add(green);
        blue = new JButton("Синий");
        add(blue);
        yellow = new JButton("Желтый");
        add(yellow);
        pink = new JButton("Розовый");
        add(pink);

        pack();
        //Начало Лямбда-выражения
        ActionListener act = (event) -> {
            if (event.getSource() == red) {
                getContentPane().setBackground(Color.RED);
            }
            if (event.getSource() == green) {
                getContentPane().setBackground(Color.GREEN);
            }
            if (event.getSource() == blue) {
                getContentPane().setBackground(Color.BLUE);
            }
            if (event.getSource() == yellow) {
                getContentPane().setBackground(Color.YELLOW);
            }
            if (event.getSource() == pink) {
                getContentPane().setBackground(Color.pink);
            }
        };
        //Конец Лямбда-выражения
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        yellow.addActionListener(act);
        pink.addActionListener(act);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewColorFrame();
    }
}

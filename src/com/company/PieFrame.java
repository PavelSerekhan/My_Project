package com.company;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class PieFrame extends JFrame {
    Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
    Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
    Color zootSuit = new Color(0x66, 0x66, 0x99);
    Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
    Color shrinkinViolet = new Color(0x66, 0x66, 0x99);
    Color miamiNice = new Color(0x33, 0xFF, 0xFF);
    Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
    Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
    Color purpleRein = new Color(0x66, 0x33, 0x99);
    Color freckle = new Color(0x99, 0x66, 0x33);

    //Создание фрейма! окно короче!
    public PieFrame() {
        super("Круговая диаграмма");
        setLookAndFeel();
        setSize(320, 290);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //PiePanel компонент граф.интерфейса кот отображает круговую диаграмму
        PiePanel pie = new PiePanel(10);// круговая дифграмма на 10 кусков
        pie.addSlice(uneasyBeingGreen, 1350);//присваиваем цвет и значение
        pie.addSlice(zuzusPetals, 1221);
        pie.addSlice(zootSuit, 316);
        pie.addSlice(sweetHomeAvocado, 251);
        pie.addSlice(shrinkinViolet, 201);
        pie.addSlice(miamiNice, 193);
        pie.addSlice(inBetweenGreen, 173);
        pie.addSlice(norwegianBlue, 164);
        pie.addSlice(purpleRein, 143);
        pie.addSlice(freckle, 127);
        add(pie);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
            // игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        PieFrame fr = new PieFrame();
    }
}

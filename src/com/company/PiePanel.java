package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class PiePanel extends JPanel {
    private PieSlice[] slice;
    private int current = 0;
    private float totalSize = 0;
    private Color backround;


    public PiePanel(int sliceCount) {
        slice = new PieSlice[sliceCount];
        backround = getBackground();
    }

    public void addSlice(Color sColor, float sSize) {
        if (current <= slice.length) {
            slice[current] = new PieSlice(sColor, sSize);
            totalSize += sSize;
            current++;
        }
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        int wigth = getSize().width - 10;
        int height = getSize().height - 15;
        int xInsert = 5;
        int yInsert = 5;
        if (wigth < 5) {
            xInsert = wigth;
        }
        if (height < 5) {
            yInsert = height;
        }
        comp2D.setColor(backround);
        comp2D.fillRect(0, 0, getSize().width, getSize().width);
        comp2D.setColor(Color.lightGray);
        Ellipse2D.Float pie = new Ellipse2D.Float(xInsert, yInsert, wigth, height);
        comp2D.fill(pie);
        float start = 0;
        for (int i = 0; i < slice.length; i++) {
            float extent = slice[i].size * 360F / totalSize;
            comp2D.setColor(slice[i].color);
            Arc2D.Float drawSlice = new Arc2D.Float(xInsert, yInsert, wigth, height, start,
                    extent, Arc2D.Float.PIE);
            start += extent;
            comp2D.fill(drawSlice);
        }
    }
}

class PieSlice {
    Color color = Color.lightGray;
    float size = 0;

    PieSlice(Color pColor, float pSize) {
        color = pColor;
        size = pSize;
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class StopSign extends JFrame {
    public StopSign() {
        super("Stop");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StopSignPanel sp = new StopSignPanel();
        add(sp);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        new StopSign();
    }
}

class StopSignPanel extends JPanel {
    @Override
    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;

        // координаты внешнего восьмиугольника (граница знака)
        int[] xBorder = { 36, 87, 123, 123, 87, 36, 0, 0 };
        int[] yBorder = { 0, 0, 36, 87, 123, 123, 87, 36 };
        // координаты внутреннего восьмиугольника (интерьер знака)
        int[] xSign = { 37, 86, 118, 118, 86, 37, 5, 5 };
        int[] ySign = { 5, 5, 37, 86, 118, 118, 86, 37 };

        // рассчитать коэффициенты, чтобы знак заполнил 100% панели
        double width = getWidth();
        double height = getHeight();
        double wFactor = (double) width / 123D;
        double hFactor = (double) height / 123D;

        // умножьте координаты восьмиугольника на эти коэффициенты
        for (int i = 0; i < xBorder.length; i++) {
            xBorder[i] = (int)(xBorder[i] * wFactor);
            yBorder[i] = (int)(yBorder[i] * hFactor);
            xSign[i] = (int)(xSign[i] * wFactor);
            ySign[i] = (int)(ySign[i] * hFactor);
        }

        // нарисовать и заполнить фон панели
        comp2D.setColor(Color.white);
        comp2D.fillRect(0, 0, (int) width, (int) height);

        // нарисовать границу знака
        comp2D.setColor(Color.black);
        comp2D.drawPolygon(xBorder, yBorder, xBorder.length);

        // нарисовать и заполнить интерьер знака
        comp2D.setColor(Color.red);
        comp2D.fillPolygon(xSign, ySign, xSign.length);
    }
}

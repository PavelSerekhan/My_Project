package com.company;

import java.util.ArrayList;
import java.awt.Point;

public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public Battlepoint() {
        // Создание целей
        createTargets();
        // Отображение игрового поля
        showMap();
        // Стрельба по трем точкам
        shoot(7,4);
        shoot(3,3);
        shoot(9,2);
        // Повторное отображение игрового поля
        showMap();
    }

    private void showMap() {
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int column = 1; column < 10; column++) {
            for (int row = 1; row < 10; row++) {
                if (row == 1) {
                    System.out.print(column + " ");
                }
                System.out.print(" ");
                Point cell = new Point(row, column);
                if (targets.indexOf(cell) > -1) {
                    // Цель находится в этой точке
                    System.out.print("X");
                } else {
                    // Цель отсутствует
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void createTargets() {
        Point p1 = new Point(5,9);
        targets.add(p1);
        Point p2 = new Point(4,5);
        targets.add(p2);
        Point p3 = new Point(9,2);
        targets.add(p3);
    }

    private void shoot(int x, int y) {
        Point shot = new Point(x,y);
        System.out.print("Стреляем по (" + x + "," + y + ") ... ");
        if (targets.indexOf(shot) > -1) {
            System.out.println("Вы потопили боевой корабль!");
            //  Удаление потопленной цели
            targets.remove(shot);
        } else {
            System.out.println("Промах.");
        }
    }

    public static void main(String[] arguments) {
        new Battlepoint();
    }
}

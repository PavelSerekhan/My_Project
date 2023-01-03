package com.company;

import javax.swing.*;

public class MainFrame extends JFrame { //создание подкласса класса FRAME
    public MainFrame(){
        // настройка фрейма
        super("Основной фрейм");// вызываем один из конструкторов класса JFrame
        //setTitle("Основной фрейм"); если не был задан аргумент сначала, то можно потом задать
        setSize(322, 122); // настройка размера фрейма
        //метод "pack()" уст размер фрейма предпочтительного размера
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// задание действия после щелчка на кнопке
        // exit on close - выход из проги после щелчка на кнопке
        setVisible(true);//отображение фрейма

        //setLookAndFeel() метод настройки внешнего вида интерфейса


    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
    }
}

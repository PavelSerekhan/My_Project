package com.company;

import javax.crypto.SealedObject;
import javax.swing.*;
import java.awt.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame(){
        super("OK!");
        setLookAndFeel();        // метод настройки внешнего интерфейса
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //задание действия после щелчка на кнопке

        FlowLayout flo = new FlowLayout();// создание менеджера компоновки
        setLayout(flo); // вызов метода setLayout, чтобы связать менеджер с контейнером

       JLabel label = new JLabel("Salution mondo!");
       add(label);
        setVisible(true);        //отображение фрейма
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        }catch (Exception exc){
//           //игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        SalutonFrame frame = new SalutonFrame();
    }
}

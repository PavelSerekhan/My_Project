package com.company;

import javax.swing.*;
import java.awt.*;

public class PlayBack extends JFrame {
    public PlayBack(){
        super("PlayBack");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Воспроизведение");
        JButton stop = new JButton("Остановить");
        JButton pause = new JButton("Пауза");
        add(play);
        add(stop);
        add(pause);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
//           //игнорировать ошибки
        }
    }

    public static void main(String[] args) {
        new PlayBack();
    }
}

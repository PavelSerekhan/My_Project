package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyViewer extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Нажмите любую клавишу в текстовом поле.");

    public KeyViewer(){
        super("KeyViewer");
        setLookAndFeel();
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);

        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char  key = e.getKeyChar();
        keyLabel.setText(" Вы нажали " + key);

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        new KeyViewer();
    }
}

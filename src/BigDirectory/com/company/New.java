package com.company;

import javax.swing.*;
import java.awt.*;

public class New extends JFrame{
    public New (){
        super("New Window");
        setLookAndFeel();
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton okButton = new JButton("OK");
        add(okButton);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);

        setVisible(true);

    }

    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        }catch (Exception exc){

        }
    }

    public static void main(String[] args) {
        new New();
    }
}
package com.company;

import javax.swing.*;
import java.awt.*;

class CheckBox extends JFrame {
    public CheckBox(){
        super("CheckBox");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,250);

        JCheckBox box = new JCheckBox("Box",true);
        JCheckBox box1 = new JCheckBox("Box1",true);
        JCheckBox box2 = new JCheckBox("Box2",false);
        JCheckBox box3 = new JCheckBox("Box3",true);

        FlowLayout flo = new FlowLayout();
        ButtonGroup group = new ButtonGroup();
        group.add(box);
        group.add(box1);
        group.add(box2);
        group.add(box3);
        setLayout(flo);
        add(box);
        add(box1);
        add(box2);
        add(box3);

        setVisible(true);
    }
    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.NimbusLookAndFeel");
        } catch (Exception exc) {

        }
    }

    public static void main(String[] args) {
        new CheckBox();
    }

}

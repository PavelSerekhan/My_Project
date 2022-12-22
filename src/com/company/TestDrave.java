package com.company;

import javax.imageio.event.IIOWriteWarningListener;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class TestDrave extends JFrame {
   public TestDrave(){
       super("IKS");
       setLookAndFeel();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(350,200);

//       JCheckBox box = new JCheckBox("Box", true);
//       FlowLayout flo = new FlowLayout();
//       setLayout(flo);
//       add(box);
       JLabel label = new JLabel("То что нельзя удалить!");
       add(label);
       JTextField text = new JTextField(20);
       add(text);
       FlowLayout flo = new FlowLayout();
       setLayout(flo);
       JButton ok = new JButton("Пуск");
       add(ok);
       setVisible(true);
       }

    private void setLookAndFeel() {
    }

    public static void main(String[] args) {
        new TestDrave();
    }
}


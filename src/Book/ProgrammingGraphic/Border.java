package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Border extends JFrame {

    private JPanel panel;

    public Border() {
        setSize(400, 300);

        panel = new JPanel();
        add(panel, BorderLayout.SOUTH);
//        panel.setLayout(new GridLayout(1,2)); //сетка

//        var yellowButton = new JButton("Yellow");
//        var greenButton = new JButton("Green");
//        var redButton = new JButton("Red");

        makeButton("Yellow", Color.YELLOW);
        makeButton("Green", Color.GREEN);
        makeButton("Blue", Color.BLUE);
    }

    public void makeButton(String name, Color backgroundColor) {
        JButton button = new JButton(name);
        panel.add(button);
        button.addActionListener(event -> panel.setBackground(backgroundColor));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Border border = new Border();
            border.setTitle("Заголовок");
            border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            border.setVisible(true);
        });
    }
}

package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame {

    private JPanel buttonPanel;
    private ButtonGroup group;
    private JLabel label;
    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame() {
        label = new JLabel("Что хочешь, то и напиши!");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        //ввести кнопки переключатели
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Small", 8);
        addRadioButton("Medium", 12);
        addRadioButton("Large", 18);
        addRadioButton("Extra large", 36);

        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addRadioButton(String name, int size) {
        boolean selected = size == DEFAULT_SIZE;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener = event ->
                label.setFont(new Font("Serif", Font.PLAIN, size));
        button.addActionListener(listener);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
            radioButtonFrame.setSize(400, 400);
            radioButtonFrame.setTitle("Title");
            radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            radioButtonFrame.setVisible(true);
        });
    }
}

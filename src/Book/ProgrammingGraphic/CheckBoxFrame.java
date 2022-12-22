package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 24;

    public CheckBoxFrame() {
        //ввести метку образцового текста
        label = new JLabel("Пофиг какой текст");
        label.setFont(new Font("Serif", Font.PLAIN,FONTSIZE));
        add(label,BorderLayout.CENTER);

        // в этом приемнике событий устанавливается атрибут шрифта для воспроизведения
        // метки по состоянию флажка

        ActionListener listener = event -> {
            int mode = 0;
            if (bold.isSelected()) mode += Font.BOLD;
            if (italic.isSelected()) mode += Font.ITALIC;
            label.setFont(new Font("Serif",mode,FONTSIZE));
        };
        //ввести флажки

        JPanel buttonPanel = new JPanel();

        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
//        bold.setSelected(true);
        buttonPanel.add(bold);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        buttonPanel.add(italic);

        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
            checkBoxFrame.setSize(400,400);
            checkBoxFrame.setTitle("Title");
            checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            checkBoxFrame.setVisible(true);
        });
    }
}

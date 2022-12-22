package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

public class ComboBoxFrame extends JFrame { // поле со списком

    private JComboBox<String> faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 24;

    public ComboBoxFrame() {
        //ввести метку с образцовым текстом
        label = new JLabel("Эта строка будет изменяться!");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        //составить комбинированный список и ввести в него названия начертаний шрифта

        faceCombo = new JComboBox<>();
        faceCombo.addItem("Serif");
        faceCombo.addItem("SansSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");

        // приемник событий от комбинированного списка изменяет не выбранное начертание шрифта
        // которым набран текстом метки

        faceCombo.addActionListener(e -> label.setFont(new Font(faceCombo.getItemAt(
                faceCombo.getSelectedIndex()), Font.PLAIN, DEFAULT_SIZE)));

        // ввести комбинированный список на панели у южной границы фрейма

        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
            comboBoxFrame.setSize(400, 400);
            comboBoxFrame.setTitle("Title");
            comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            comboBoxFrame.setVisible(true);
        });
    }
}

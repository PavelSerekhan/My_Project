package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

/**
 * Фрейм со строкой меню, при выборе команды File -> About из которого появляется диалог окно
 */
public class DialogFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private AboutDialog dialog;

    public DialogFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        //сконструировать меню файл
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        var fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // ввести в меню пункты About и Exit

        // при выборе пункта меню About открывается одноименное диалоговое окно
        var aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(event -> {
            if (dialog == null)  // в первый раз
                dialog = new AboutDialog(DialogFrame.this);
            dialog.setVisible(true);
            //показать диалоговое окно
        });
        fileMenu.add(aboutItem);

        //при выходе из пункта меню Exit происходит выход из программы

        var exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(event -> System.exit(0));
        fileMenu.add(exitItem);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            DialogFrame dialogFrame = new DialogFrame();
            dialogFrame.setTitle("Dialog Frame");
            dialogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dialogFrame.setVisible(true);
        });
    }
}


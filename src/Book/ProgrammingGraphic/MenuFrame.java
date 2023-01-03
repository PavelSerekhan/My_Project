package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private Action saveAction;
    private Action saveAsAction;
    private JCheckBoxMenuItem readonlyItem;
    private JPopupMenu popup;

    class TestAction extends AbstractAction {

        public TestAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getValue(Action.NAME + "selected."));
        }
    }

    public MenuFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        var fileMenu = new JMenu("File");
        fileMenu.add(new TestAction("New"));

        // продемонстрировать применение оперативных клавиш

        var openItem = fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        fileMenu.addSeparator();  // добавление разделения в меню

        saveAction = new TestAction("Save");
        JMenuItem saveItem = fileMenu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        saveAsAction = new TestAction("Save as");
        fileMenu.add(saveAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        //продемонстрировать применение флажков и кнопок-переключателей

        readonlyItem = new JCheckBoxMenuItem("Read-only");
        readonlyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saveOk = !readonlyItem.isSelected();
                saveAction.setEnabled(saveOk);
                saveAsAction.setEnabled(saveOk);
            }
        });

        var group = new ButtonGroup();
        var insertItem = new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);
        var overTypeItem = new JRadioButtonMenuItem("OverType");
        group.add(insertItem);
        group.add(overTypeItem);

        //продемонстрировать применение пиктограмм

        var cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON,new ImageIcon("cut.gif"));
        var copyAction = new TestAction("Copy");
        var pasteAction = new TestAction("Paste");

        var editMenu = new JMenu("Edit");
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);
        editMenu.addSeparator();

        //продемонстрировать применение вложенных меню

        var optionMenu = new JMenu("Options");
        optionMenu.add(readonlyItem);
        optionMenu.addSeparator();
        optionMenu.add(insertItem);
        optionMenu.add(overTypeItem);

        editMenu.add(optionMenu);

        // продемонстрировать применение клавиш быстрого доступа

        var helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');

        JMenuItem indexItem = new JMenuItem("Index");
        indexItem.setMnemonic('I');
        helpMenu.add(indexItem);

        // назначить клавишу быстрого доступа используя объект действия

        var aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, (int) 'A');
        helpMenu.add(aboutAction);

        // ввести все меню верхнего уровня в строку меню

        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        //продемонстрировать применение всплывающих окон

        popup = new JPopupMenu();
        popup.add(cutAction);
        popup.add(copyAction);
        popup.add(pasteAction);

        var panel = new JPanel();
        panel.setComponentPopupMenu(popup);
        add(panel);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MenuFrame menuFrame = new MenuFrame();
            menuFrame.setTitle("&&& Test");
            menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menuFrame.setVisible(true);
        });
    }
}

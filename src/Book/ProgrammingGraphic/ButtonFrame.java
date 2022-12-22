package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {

    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        //создаем экранные кнопки
//        var yellowButton = new JButton("Yellow");
//        var blueButton = new JButton("Blue");
//        var redButton = new JButton("Red");

        buttonPanel = new JPanel();

        //ввести кнопки на панели
//        buttonPanel.add(yellowButton);
//        buttonPanel.add(blueButton);
//        buttonPanel.add(redButton);


        add(buttonPanel); //ввести панель во фрейм

        //сформировать действия с экранными кнопками
//        var yellowAction = new ColorAction(Color.YELLOW);
//        var blueAction = new ColorAction(Color.BLUE);
//        var redAction = new ColorAction(Color.RED);
//
//        //связать действия с экранными кнопками
//        yellowButton.addActionListener(yellowAction);
//        blueButton.addActionListener(blueAction);
//        redButton.addActionListener(redAction);


        // для установки подсказки возле кнопки
        var blueAction = new ColorAction("Blue", Color.BLUE);
        var blueButton = new JButton(blueAction);
        var greenAction = new ColorAction("Green",Color.GREEN);
        var greenButton = new JButton(greenAction);

        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        // вызываем метод
//        makeButton("Red", Color.RED);
//        makeButton("Yellow", Color.YELLOW);
//        makeButton("Green", Color.GREEN);
    }

//    private class ColorAction implements ActionListener {  // класс приемника событий
//
//        private Color backgroundColor;
//
//        public ColorAction(Color color) {
//            this.backgroundColor = color;
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent event) {  //чтобы кнопки реагировали
//        buttonPanel.setBackground(backgroundColor);
//        }
//    }

    // можно не создавать класс который implements ActionListener, а сделать через лямбда выражение
//    public void makeButton(String name, Color backgroundColor) {
//        JButton button = new JButton(name);
//        buttonPanel.add(button);
//        button.addActionListener(event -> buttonPanel.setBackground(backgroundColor));
//
//    }

    // установка подсказки около кнопки
    public class ColorAction extends AbstractAction {

        public ColorAction(String name, Color color) {
            putValue(Action.NAME, name);
            putValue("color" ,color);
            putValue(Action.SHORT_DESCRIPTION,"Установить цвет панели на  " + name.toLowerCase());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        Color c = (Color) getValue("color");
        buttonPanel.setBackground(c);
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            // поток диспетчеризации событий (для безопасности(в связи с усложнением компонентов
//            Swing))
            ButtonFrame buttonFrame = new ButtonFrame();
            buttonFrame.setTitle("Button Test");
            buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buttonFrame.setVisible(true);
        });
    }
}

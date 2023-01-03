package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorld {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent()); // для ввода на панели содержимого данного фрейма
        pack();  // изменяет размеры данного окна
    }
}

class NotHelloWorldComponent extends JComponent {

    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGTH = 200;

    @Override
    public void paintComponent(Graphics g) {    // для описания способа рисования заданного компонента
        g.drawString("Not a Hello, World programm", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() { // для возврата предпочтительных размеров
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGTH);
    }
}

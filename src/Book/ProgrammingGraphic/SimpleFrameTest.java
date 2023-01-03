package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> { // поток диспетчеризации событий
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Window");

            Toolkit kit = Toolkit.getDefaultToolkit(); // узнаем размер экрана
            Dimension screenSize = kit.getScreenSize(); // возвращает размер экрана
            int screenWigth = screenSize.width;
            int screenHeigth = screenSize.height;
            frame.setSize(screenWigth/2, screenHeigth/2);

            Image img = new ImageIcon("icon.gif").getImage(); //пиктограмма
            frame.setIconImage(img);

//            frame.setLocation(500,250);//положение окна
            frame.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame() {
//        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

    }
}




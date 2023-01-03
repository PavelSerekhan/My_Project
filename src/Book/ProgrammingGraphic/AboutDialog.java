package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

public class AboutDialog extends JDialog {

    public AboutDialog(JFrame owner){
        super(owner,"About DialogTest", true);

        // ввести HTML- метку по центру окна
        add(new JLabel("<html><h1><i>Core Java</i></h1><hr>By Cay Horstmann</html>"),
                BorderLayout.CENTER);

        //при выборе кнопки ОК диалоговое окно закрывается
        var ok = new JButton("OK");
        ok.addActionListener(event -> setVisible(false));

        //ввести кнопку ОК в нижней части экрана у южной его границы
        var panel = new JPanel();
        panel.add(ok);
        add(panel,BorderLayout.SOUTH);
        pack();
    }
}

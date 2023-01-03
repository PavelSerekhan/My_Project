package Book.ProgrammingGraphic;

import javax.swing.*;
import java.awt.*;

public class TextComponentFrame extends JFrame {

    public static final int TEXTAREA_ROWS = 8;
    public static final int TEXTAREA_COLUMNS = 40;

    public TextComponentFrame() {

        var textField = new TextField();

        var passwordField = new JPasswordField();

        var northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(new Label("User name: "));
        northPanel.add(textField);

        northPanel.add(new JLabel("Password: "));
        northPanel.add(passwordField);

        add(northPanel, BorderLayout.NORTH);

        var textArea = new TextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
        var scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);

        insertButton.addActionListener(event ->  //приемник событий
                textArea.append("User name: " + textField.getText()
                        + ", Password: " + new String(passwordField.getPassword() + "\n")));

        add(southPanel, BorderLayout.SOUTH);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TextComponentFrame textFrame = new TextComponentFrame();
            textFrame.setSize(400, 400);
            textFrame.setTitle("Password");
            textFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            textFrame.setVisible(true);
        });
    }
}

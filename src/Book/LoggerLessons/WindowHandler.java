package Book.LoggerLessons;

import javax.swing.*;
import java.io.*;
import java.util.logging.*;

/**
 * Обработчик для отображения протокольных записей в окне
 */
public class WindowHandler extends StreamHandler {
    private JFrame frame;

    public WindowHandler() {
        frame = new JFrame();
        final JTextArea output = new JTextArea();
        output.setEditable(false);
        frame.setSize(200, 200);
        frame.add(new JScrollPane(output));
        frame.setFocusableWindowState(false);
        frame.setVisible(true);

        setOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                // не вызывается
            }

            public void write(byte[] b, int off, int len) {
                output.append(new String(b, off, len));
            }
        });
    }

    public void publish(LogRecord record) {
        if (!frame.isVisible()) return;
        super.publish(record);
        flush();
    }
}

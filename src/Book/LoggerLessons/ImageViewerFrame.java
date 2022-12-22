package Book.LoggerLessons;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.util.logging.*;

public class ImageViewerFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGT = 400;

    private JLabel label;
    private static Logger logger = Logger.getLogger("com.horstmann.corejava");

    public ImageViewerFrame() {
        logger.entering("ImageViewerFrame", "<init>");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGT);

        //установить строку меню
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menu.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());
    }

    private class FileOpenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            logger.entering("ImageViewerFrame.FileOpenListener",
                    "actionPerformed", event);

            //установить селектор файлов
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));

            //принять все файлы с расширением gif
            chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.getName().toLowerCase()
                            .endsWith("gif") || f.isDirectory();
                }

                @Override
                public String getDescription() {
                    return "GIF Images";
                }
            });
            //показать диалоговое окно селектора файлов
            int r = chooser.showOpenDialog(ImageViewerFrame.this);

            //если файл изображения подходит, выбрать его в качестве пиктограммы для метки
            if (r == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getPath();
                logger.log(Level.FINE, "Reading file {0}", name);
                label.setIcon(new ImageIcon(name));
            } else
                logger.fine("File open dialog canceled.");
            logger.exiting("ImageViewerFrame.FileOpenListener",
                    "actionPerformed");
        }
    }
}

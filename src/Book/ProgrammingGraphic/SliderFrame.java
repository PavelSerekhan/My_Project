package Book.ProgrammingGraphic;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;

public class SliderFrame extends JFrame {

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listener;

    public SliderFrame() {
        sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridBagLayout());

        // общий приемник событий для всех ползунков
        listener = event -> {
            //обновить текстовое поле, если выбранный ползунок установиться на отметке с другим зн
            JSlider source = (JSlider) event.getSource();
            textField.setText("" + source.getValue());
        };

        // ввести простой ползунок
        var slider = new JSlider();
        addSlider(slider, "Plain");

        // ввести ползунок с основными и неосновными отметками

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Ticks");

        //ввести ползунок, привязываемый к отметкам

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Snap to ticks");

        //ввести ползунок без отметок

        slider = new JSlider();
        slider.setPaintTicks(true);

        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "No track");

        //ввести обращенный ползунок

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setInverted(true);
        addSlider(slider, "Inverted");

        //ввести ползунок с числовыми обозначениями отметок

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Labels");

        //ввести ползунок с буквенными обозначениями отметок

        slider = new JSlider();
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        var labelTable = new Hashtable<Integer,Component>();
        labelTable.put(0, new JLabel("A"));
        labelTable.put(20, new JLabel("B"));
        labelTable.put(40, new JLabel("C"));
        labelTable.put(60, new JLabel("D"));
        labelTable.put(80, new JLabel("E"));
        labelTable.put(100, new JLabel("F"));
        slider.setLabelTable(labelTable);
        addSlider(slider, "Custom labels");

        // Вводит текстовое поле для показа значения, на котором установлен выбранный
        // в настоящий момент ползунок
        textField = new JTextField();
        add(sliderPanel, BorderLayout.CENTER);
        add(textField,BorderLayout.SOUTH);
        pack();
    }

    public void addSlider(JSlider s, String description) {
        s.addChangeListener(listener);
        var panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        var gbc = new GridBagConstraints();
        gbc.gridy = sliderPanel.getComponentCount();
        gbc.anchor = GridBagConstraints.WEST;
        sliderPanel.add(panel, gbc);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SliderFrame sliderFrame = new SliderFrame();
            sliderFrame.setSize(400, 400);
            sliderFrame.setTitle("Slider Test");
            sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sliderFrame.setVisible(true);
        });
    }
}

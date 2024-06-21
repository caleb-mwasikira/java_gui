import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("radio button and checkbox example");
    }
}

class MyJFrame extends JFrame {
    int frameWidth = 500;
    int frameHeight = 400;

    public MyJFrame(String title) {
        super(title);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(0, 2));

        // radio button panel
        JPanel panel = new JPanel(new GridLayout(0, 1));
        Border border = BorderFactory.createTitledBorder("Crystal Shopping");
        panel.setBorder(border);

        ButtonGroup group = new ButtonGroup();

        String[] items = {"Salt", "Sugar", "Flour"};
        for (String item: items) {
            JRadioButton btn = new JRadioButton(item);
            group.add(btn);
            panel.add(btn);
        }
        contentPane.add(panel);

        // checkbox button panel
        panel = new JPanel(new GridLayout(0, 1));
        border = BorderFactory.createTitledBorder("Vegetable shopping");
        panel.setBorder(border);

        items = new String[]{"SukumaWiki", "Cabbage", "Spinach", "Kienyeji"};
        for(String item: items) {
            JCheckBox checkbox = new JCheckBox(item);
            panel.add(checkbox);
        }
        contentPane.add(panel);

        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

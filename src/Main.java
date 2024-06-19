import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("counter");
    }
}

class MyJFrame extends JFrame {
    int count = 0;
    int frameWidth = 700;
    int frameHeight = 400;

    JLabel label;

    public MyJFrame(String title) {
        setSize(frameWidth, frameHeight);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // exlicitly setting bounds for all our components

        Container container = getContentPane();

        label = new JLabel(getMessage());
        label.setBounds((int)(0.25 * frameWidth), 25, frameWidth, 50);
        container.add(label);

        JButton addButton = new JButton("Add");
        addButton.setBounds((int)(0.25 * frameWidth), 75, 100, 25);
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                count++;
                label.setText(getMessage());
            }
        });
        container.add(addButton);

        JButton resetBtn = new JButton("Reset");
        resetBtn.setBounds((int)(0.25 * frameWidth) + 120, 75, 100, 25);
        resetBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                count = 0;
                label.setText(getMessage());
            }
        });
        container.add(resetBtn);

        JButton subtractButton = new JButton("Subtract");
        subtractButton.setBounds((int)(0.25 * frameWidth) + 240, 75, 100, 25);
        subtractButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                count--;
                label.setText(getMessage());
            }
        });
        container.add(subtractButton);

        setVisible(true);
    }

    String getMessage() {
        return String.format("Count is now at %d", count);
    }
}

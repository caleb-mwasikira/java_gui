import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyJFrame("Closing frame with Window Listener");
        frame.setBounds(50, 50, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyJFrame extends JFrame {
    public MyJFrame(String title) {
        super(title);
        this.setBounds(50,50, 600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // create a container with layout
        Container container = getContentPane();
        container.setBackground(Color.white);
        FlowLayout flow_layout = new FlowLayout();
        container.setLayout(flow_layout);

        // add components to the container
        JButton[] buttons = {
                new JButton("Start"),
                new JButton("Stop"),
                new JButton("Add"),
                new JButton("Subtract"),
                new JButton("Multiply"),
                new JButton("Modulus"),
                new JButton("Exit"),
        };

        for (JButton button : buttons) {
            container.add(button);
        }

        this.setContentPane(container);
        this.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyJFrame("Working with labels and textfield");
    }
}

class MyJFrame extends JFrame {
    public MyJFrame(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
        setSize(300,800);

        Container container= getContentPane();
        container.setBackground(Color.lightGray);

        FlowLayout flowLayout=new FlowLayout();
        container.setLayout(flowLayout);

        JLabel label=new JLabel("student info");
        container.add(label);

        JTextField text=new JTextField("first name",20);
        container.add(text);
        setContentPane(container);
    }
}
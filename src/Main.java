import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyJFrame("Closing frame with Process Window Event");
        frame.setBounds(50, 50, 600, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyJFrame extends JFrame {
    MyJFrame(String title) {
        this.setTitle(title);
    }

    protected void processWindowEvent(WindowEvent e) {
        if(e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
}
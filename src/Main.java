import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("Handling mouse events");
    }
}

class MyWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing application. Bye :(");
        System.exit(0);
    }
}

class MyJFrame extends JFrame implements MouseListener, MouseMotionListener {
    String msg = "";
    Point mousePos = new Point();

    public MyJFrame(String title) {
        setSize(500, 400);
        setTitle(title);

        addWindowListener(new MyWindowListener());
        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        msg = msg + "-- mouse clicked";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        // save the coordinates
        mousePos = mouseEvent.getPoint();
        msg = "mouse pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        // save the coordinates
        mousePos = mouseEvent.getPoint();
        msg = "mouse released";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        msg = "mouse entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        msg = "mouse exited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        mousePos = mouseEvent.getPoint();
        msg = "* mouse dragged X: " + mousePos.x + " Y: " + mousePos.y;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        mousePos = mouseEvent.getPoint();
        msg = "* moving mouse X: " + mousePos.x + " Y: " + mousePos.y;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mousePos.x, mousePos.y);
    }
}
package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("ScrollPane example");
    }
}

class MyJFrame extends JFrame {
    int frameWidth = 500;
    int frameHeight = 400;

    MyJFrame(String title) {
        super(title);
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        Path iconPath = Paths.get("/home/netrunner/Pictures/profile_pics/wallguy.png");
        Icon image = new ImageIcon(iconPath.toString());
        JLabel label = new JLabel(image);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(label);
        topPanel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(topPanel);
        setVisible(true);
    }
}

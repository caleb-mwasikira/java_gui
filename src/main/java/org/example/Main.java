package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("Event Handling Example");
    }
}

class MyJFrame extends JFrame {
    int frameWidth = 500;
    int frameHeight = 400;
    JLabel myLabel;

    MyJFrame(String title) {
        super(title);
        setSize(frameWidth, frameHeight);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.PAGE_AXIS));

        myLabel = new JLabel("Hello World");
        JButton viewButton = new JButton("View");
        viewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                myLabel.setVisible(true);
            }
        });

        JButton hideButton = new JButton("Hide");
        hideButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                myLabel.setVisible(false);
            }
        });

        topPanel.add(myLabel);
        topPanel.add(viewButton);
        topPanel.add(hideButton);

        contentPane.add(topPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
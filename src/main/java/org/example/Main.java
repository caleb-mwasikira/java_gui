package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new MyJframe("BorderLayout Demo");
    }
}

class MyJframe extends JFrame {
    public MyJframe(String title) {
        super(title);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // add components
        contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
        contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        contentPane.add(new JButton("EAST"), BorderLayout.EAST);
        contentPane.add(new JButton("WEST"), BorderLayout.WEST);
        contentPane.add(new JButton("CENTER"), BorderLayout.CENTER);

        this.setContentPane(contentPane);
        this.setVisible(true);
    }
}
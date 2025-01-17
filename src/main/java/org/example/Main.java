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
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

        // add components
        for(int i =0; i < 9; i++) {
            JButton btn = new JButton("Button " + i);
            contentPane.add(btn);
        }

        this.setContentPane(contentPane);
        this.setVisible(true);
    }
}
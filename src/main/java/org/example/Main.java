package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new MyJframe("Flow Layout Demo");
    }
}

class MyJframe extends JFrame {
    public MyJframe(String title) {
        super(title);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // add components
        JLabel label = new JLabel("Enter name: ");
        JTextField txtField = new JTextField(10);
        JButton submitBtn = new JButton("SUBMIT");

        contentPane.add(label);
        contentPane.add(txtField);
        contentPane.add(submitBtn);
        
        this.setContentPane(contentPane);
        this.setVisible(true);
    }
}
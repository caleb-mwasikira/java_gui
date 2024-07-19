package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        new MyJframe("Event listeners");
    }
}

class MyJframe extends JFrame {
    public MyJframe(String title) {
        super(title);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // add components
        Container topPanel = new JPanel();
        JLabel nameLabel = new JLabel("Enter your name: ");
        JTextField nameInputField = new JTextField("", 20);
        topPanel.add(nameLabel);
        topPanel.add(nameInputField);
        contentPane.add(topPanel);

        topPanel = new JPanel();
        JButton submitBtn = new JButton("Submit");
        submitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String userName = nameInputField.getText();
                JOptionPane.showMessageDialog(contentPane, "Welcome " + userName);
            }
        });
        topPanel.add(submitBtn);
        contentPane.add(topPanel);

        this.setContentPane(contentPane);
        this.setVisible(true);
    }
}
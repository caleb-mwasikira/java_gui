package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        new MyJFrame("login form");
    }
}

class MyJFrame extends JFrame {
    int frameWidth = 500;
    int frameHeight = 400;
    Container contentPane;
    JTextField emailField;
    JPasswordField passwordField;

    public MyJFrame(String title) {
        super(title);

        contentPane = getContentPane();
        contentPane.setLayout(null);
        setComponents();

        setMinimumSize(new Dimension(frameWidth, frameHeight));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setComponents() {
        // email
        JPanel panel = new JPanel(new FlowLayout());

        JLabel emailLabel = new JLabel("Email: ");
        panel.add(emailLabel);
        emailField = new JTextField(null, 20);
        panel.add(emailField);

        panel.setBounds(20, 20, 400, 50);
        contentPane.add(panel);

        // password
        panel = new JPanel(new FlowLayout());

        JLabel passwordLabel = new JLabel("Password: ");
        panel.add(passwordLabel);
        passwordField = new JPasswordField(null, 20);
        panel.add(passwordField);

        panel.setBounds(5, 70, 400, 50);
        contentPane.add(panel);

        // buttons
        panel = new JPanel(new FlowLayout());

        JButton clearBtn = new JButton("Clear");
        clearBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emailField.setText("");
                passwordField.setText("");
            }
        });
        panel.add(clearBtn);
        JButton loginBtn = new JButton("Login");
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleLogin();
            }
        });
        panel.add(loginBtn);

        panel.setBounds(15, 120, 400, 50);
        contentPane.add(panel);
    }

    public String join(char[] chars) {
        StringBuilder str = new StringBuilder();
        for (char ch: chars) {
            str.append(ch);
        }
        return str.toString();
    }

    public void handleLogin() {
        String email = emailField.getText();
        String password = join(passwordField.getPassword());

        if(email.equals("johndoe@gmail.com") && password.equals("password")) {
            JOptionPane.showMessageDialog(contentPane, "Login success");
        } else {
            JOptionPane.showMessageDialog(contentPane, "Login failed");
        }
    }
}

package com.company.lectures.lecture13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button{
    JPanel panel= new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    @Override
    public void render() {
        /*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello world!");
        label.setOpaque(true);
        label.setBackground(new Color(200,15,120));
        label.setFont(new Font("Dialog",Font.BOLD,44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320,200);
        frame.setVisible(true);
        onClick();*/
        System.out.println("Windows render");


    }

    @Override
    public void onClick() {
        /*button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });*/
        System.out.println("Window Click on button");
    }
}

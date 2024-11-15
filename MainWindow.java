// package jframe;

import javax.swing.*;
import java.awt.FlowLayout;

public class MainWindow {
    public static void main(String[] args) {

        JFrame window = new JFrame("Main Window");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.setLayout(new FlowLayout());

        JLabel label = new JLabel("Paint");
        window.add(label);

        JButton tool = new JButton("Tool");
        window.add(tool);

        JButton color = new JButton("Color");
        window.add(color);

        JButton shape = new JButton("Shape");
        window.add(shape);

        

        window.setVisible(true);
    }
}

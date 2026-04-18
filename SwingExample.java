package Swings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class SwingExample {

    SwingExample() {

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size
        jfrm.setSize(275, 100);

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!");

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(new Color(0, 0, 255));

        // Add label to frame
        jfrm.add(jlab);

        // Display frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
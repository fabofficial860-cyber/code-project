package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageButtonExample {

    JLabel label;

    ImageButtonExample() {

        JFrame frame = new JFrame("Image Button Example");

        // Label
        label = new JLabel("Click a button");
        label.setBounds(100, 250, 400, 50);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Digital Clock Button (with image)
        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
        JButton btnClock = new JButton(clockIcon);
        btnClock.setBounds(100, 80, 120, 120);

        // Hour Glass Button (with image)
        ImageIcon hourIcon = new ImageIcon("hourglass.jpg");
        JButton btnHour = new JButton(hourIcon);
        btnHour.setBounds(300, 80, 120, 120);

        // Action for Digital Clock
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Action for Hour Glass
        btnHour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(btnClock);
        frame.add(btnHour);
        frame.add(label);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
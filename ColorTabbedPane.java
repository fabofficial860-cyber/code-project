/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan */

package Swings;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPane extends JFrame {

    JPanel cyanPanel, magentaPanel, yellowPanel;
    JTabbedPane tabbedPane;

    public ColorTabbedPane() {

        // Frame setup
        setTitle("Tabbed Pane Color Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Panels
        cyanPanel = new JPanel();
        magentaPanel = new JPanel();
        yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Tabbed Pane
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 250, 150);

        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        // Optional: print selected tab color
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();

                if (index == 0) {
                    System.out.println("Cyan tab selected");
                } else if (index == 1) {
                    System.out.println("Magenta tab selected");
                } else if (index == 2) {
                    System.out.println("Yellow tab selected");
                }
            }
        });

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}

package Swings;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample extends JFrame {

    private JList<String> countryList;

    public JListExample() {

        // Create model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();

        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");

        // Create JList
        countryList = new JList<>(listModel);

        // Selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println(countryList.getSelectedValuesList());
                }
            }
        });

        // Add scroll pane
        add(new JScrollPane(countryList));

        setTitle("JList Example");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}
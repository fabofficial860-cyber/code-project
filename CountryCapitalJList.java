/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list. */

package Swings;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.HashMap;

public class CountryCapitalJList extends JFrame {

    JList<String> countryList;
    HashMap<String, String> capitalMap;

    public CountryCapitalJList() {

        // Frame setup
        setTitle("Country Capital JList");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country list
        String[] countries = {
                "USA", "India", "Vietnam", "Canada",
                "Denmark", "France", "Great Britain",
                "Japan", "Africa", "Greenland", "Singapore"
        };

        // Capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // JList
        countryList = new JList<>(countries);

        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    String selectedCountry = countryList.getSelectedValue();

                    if (selectedCountry != null) {
                        System.out.println("Capital of " + selectedCountry +
                                " is: " + capitalMap.get(selectedCountry));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalJList();
    }
}

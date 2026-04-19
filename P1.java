/*Write a Java program to store different colors using the ArrayList interface and search whether the color "Red" is available or not
    */

package Lab1;

import java.util.*;

public class P1 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");

        System.out.println(ls);

        if (ls.contains("red")) {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }
    }
}

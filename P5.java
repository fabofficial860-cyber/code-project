/* Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */

package Lab1;
import java.util.*;

public class P5 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        String str = "green";

        System.out.println("Original List: " + ls);
        System.out.println("Removing element '" + str + "': " + ls.remove(str));
        System.out.println("Updated List: " + ls);
    }
}

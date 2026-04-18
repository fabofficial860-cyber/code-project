package Lab1;
import java.util.*;

public class P2 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println("Original List: " + ls);

        ls.remove(2);
        System.out.println("After removing index 2: " + ls);

        ls.remove("Blue");
        System.out.println("After removing 'Blue': " + ls);
    }
}
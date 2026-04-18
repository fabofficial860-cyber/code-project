package Lab1;
import java.util.*;

public class P6 {

    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        ListIterator<String> iterator = ls.listIterator(2); // corrected

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
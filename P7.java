package Lab1;
import java.util.Iterator;
import java.util.LinkedList;

public class P7 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        Iterator<String> iterator = ls.descendingIterator(); // fixed

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
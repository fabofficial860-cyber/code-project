package Lab1;
import java.util.*;

public class P4 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println(ls);

        System.out.println("Using subList:");
        System.out.println(ls.subList(0, 2));
    }
}
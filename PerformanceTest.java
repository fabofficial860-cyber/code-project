/* 2a) Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2)) */

package Lab4;

public class PerformanceTest {

 public static void main(String[] args) {

     long startTime = System.currentTimeMillis();

     StringBuffer sb = new StringBuffer("Java");
     for (int i = 0; i < 10000; i++) {
         sb.append("Tpoint");
     }

     System.out.println("Time taken by StringBuffer: " + 
             (System.currentTimeMillis() - startTime) + " ms");

     startTime = System.currentTimeMillis();

     StringBuilder sb2 = new StringBuilder("Java");
     for (int i = 0; i < 10000; i++) {
         sb2.append("Tpoint");
     }

     System.out.println("Time taken by StringBuilder: " + 
             (System.currentTimeMillis() - startTime) + " ms");
 }
}

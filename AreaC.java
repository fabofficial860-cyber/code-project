package Newbasics;

import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        double radius,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();
        sc.close();
        area = Math.PI*radius*radius;
        System.out.println("Area of Circle: " + area);
    }
}

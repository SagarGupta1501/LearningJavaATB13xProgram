package ex_09_If_Condition;

import java.util.Scanner;

public class Lab066_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the side1");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        System.out.println("Enter the side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3");
        int side3 = sc.nextInt();

        if (side1 == side2 && side1 == side3)
            System.out.println("Equilateral Triangle");

        else if (side1 == side2 || side2 == side3 || side1 == side3)
            System.out.println("Isoseles triangle");

        else
            System.out.println("Scalence traingle");


    }
}

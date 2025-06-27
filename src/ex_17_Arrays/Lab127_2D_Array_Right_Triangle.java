package ex_17_Arrays;

import java.util.Scanner;

public class Lab127_2D_Array_Right_Triangle {
    public static void main(String[] args) {

        System.out.println("Enter the pattern no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

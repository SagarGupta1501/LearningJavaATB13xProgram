package ex_17_Arrays;

import java.util.Scanner;

public class Lab128_2D_Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of table");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i*j);

            }
            System.out.println();

        }



    }
}

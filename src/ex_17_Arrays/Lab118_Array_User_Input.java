package ex_17_Arrays;

import java.util.Scanner;

public class Lab118_Array_User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for array");
        int size = sc.nextInt();

        int[] marks = new int[size];

        // to get user inputs
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the numbers");
            marks[i] = sc.nextInt();
        }

        // to print the array
        for (int i = 0; i < size; i++) {
            System.out.println("Numbers are " + marks[i]);
        }





    }
}

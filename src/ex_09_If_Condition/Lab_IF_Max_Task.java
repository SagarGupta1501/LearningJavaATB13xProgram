package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Max_Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = sc.nextInt();

        System.out.println("Enter the second no.");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a + " is maximum");
        }else
            System.out.println(b + " is maximum");


    }
}

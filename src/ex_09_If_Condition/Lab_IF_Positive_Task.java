package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Positive_Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = sc.nextInt();

        if (a>0){
            System.out.println(a + " is positive");
        }else
            System.out.println(a + " is negative");
    }
}

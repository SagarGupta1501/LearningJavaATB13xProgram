package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_SmallestOf3_Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = sc.nextInt();

        System.out.println("Enter the second no.");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd no.");
        int c = sc.nextInt();

        if (a<b && a<c){
            System.out.println(a + " is smallest");
        }else if (b<c) {
            System.out.println(b + " is smallest");
        }else
            System.out.println(c + " is smallest");

    }
}

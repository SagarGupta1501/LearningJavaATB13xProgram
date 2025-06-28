package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Valid_Triangle_Task {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int a = sc.nextInt();

        System.out.println("Enter the second side");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd side");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid triangle");
        }else
            System.out.println("Not a valid triangle");

    }
}

package ex_09_If_Condition;

import java.util.Scanner;

public class Lab064_IF {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>18)
            System.out.println("you can vote");
        else
            System.out.println("You cannot vote");
    }
}

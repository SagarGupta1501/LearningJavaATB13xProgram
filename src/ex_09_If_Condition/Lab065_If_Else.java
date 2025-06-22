package ex_09_If_Condition;

import java.util.Scanner;

public class Lab065_If_Else {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>18)
            System.out.println("Allowed to drive");
        else
            System.out.println("Not allowed to drive");

    }

}

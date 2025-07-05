package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Senior_Citizen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if(age>0) {
            if (age <= 12) {
                System.out.println("Child");
            } else if (age > 13 && age <= 19) {
                System.out.println("Teenager");
            } else if (age > 20 && age <= 64) {
                System.out.println("Adult");
            } else
                System.out.println("Senior Citizen");
        }else
            System.out.println("Invalid input");

    }
}

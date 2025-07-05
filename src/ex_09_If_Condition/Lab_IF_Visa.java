package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Visa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the Visa Status");
        String visa_Status = sc.next();


        if(age >= 18 && visa_Status.equalsIgnoreCase("Valid")){
            System.out.println("Person can travel");
        }else
            System.out.println("Person cannot travel");


    }
}

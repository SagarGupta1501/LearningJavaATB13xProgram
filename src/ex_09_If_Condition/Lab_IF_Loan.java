package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Loan {

    public static void main(String[] args) {

        int age;
        float salary;
        int credit_score;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        age = sc.nextInt();

        System.out.println("Enter the salary");
        salary = sc.nextFloat();

        System.out.println("Enter the credit score");
        credit_score = sc.nextInt();

        if(age > 15 && age < 80){
            if(salary>30000){
                if(credit_score>650 && credit_score<850){
                    System.out.println("Loan Applicable");
                }else
                    System.out.println("Loan not applicable");

            }else
                System.out.println("Loan not applicable");
        }else
            System.out.println("Loan not applicable");






    }




}

package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Bonus {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = sc.nextInt();

        System.out.println("Enter the years of experience");
        int exp = sc.nextInt();

        double bonus;

        if(exp<1){
            System.out.println("No bonus");
        }else if(exp>1 && exp<=3 ){
            bonus = sal * 0.05;
            System.out.println("The bonus is " + bonus);
        }else if(exp>4 && exp<=6) {
            bonus = sal * 0.1;
            System.out.println("The bonus is " + bonus);
        }else{
            bonus = sal * 0.15;
            System.out.println("The bonus is " + bonus);
        }




    }
}

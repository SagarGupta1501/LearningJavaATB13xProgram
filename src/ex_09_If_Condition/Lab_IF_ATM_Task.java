package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_ATM_Task {

    public static void main(String[] args) {

        int acc_bal = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");
        int wd = sc.nextInt();

        if(wd == 0){
            System.out.println("The withdrawal amount should be greater than 0.");
        } else if (wd%100 != 0){
            System.out.println("The withdrawal amount should be a multiple of 100.");
        }else if (wd > 10000){
            System.out.println("The withdrawal amount should not exceed the account balance.");
        }else {
            System.out.println("The withdrawal amount is: " + wd);
            System.out.println("Remaining balance is: " + (acc_bal - wd));
        }

    }
}

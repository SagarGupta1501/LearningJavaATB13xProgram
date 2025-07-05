package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Convert_Days {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int total_days = sc.nextInt();

        int years = total_days/365;
        int remaining_days = total_days % 365;

        int months = remaining_days/30;
        int days = remaining_days & 30;

        System.out.println(years + " Years " + months + " Months " + days + " Days");


    }
}

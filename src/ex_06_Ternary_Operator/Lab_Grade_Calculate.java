package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab_Grade_Calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        String Grade = (marks >= 90) ? "A+" : (marks > 75 && marks < 90) ? "A" : (marks >= 60 && marks < 75) ? "B" : (marks >= 40 && marks < 60) ? "C" : "Fail";

        System.out.println(Grade);


    }
}

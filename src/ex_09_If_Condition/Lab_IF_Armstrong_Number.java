package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Armstrong_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int number = sc.nextInt();

        int count = 0;

        int original = number;
        int num2 = number;

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);

        double results = 0.00d;
        while(num2 != 0){
            int digit = num2 % 10;
            results = results + Math.pow(digit, count);
            num2 = num2/10;
        }

        if (results == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

    }
}

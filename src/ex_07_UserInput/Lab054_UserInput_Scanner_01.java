package ex_07_UserInput;

import java.util.Scanner;

public class Lab054_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        // nextInt will only take Integer value
        int age = sc.nextInt();

        System.out.println(age);
    }
}

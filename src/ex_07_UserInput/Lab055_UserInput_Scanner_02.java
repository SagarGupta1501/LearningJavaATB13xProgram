package ex_07_UserInput;

import java.util.Scanner;

public class Lab055_UserInput_Scanner_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();

        System.out.println(s);

        double double_input = sc.nextDouble();
        System.out.println(double_input);




    }
}

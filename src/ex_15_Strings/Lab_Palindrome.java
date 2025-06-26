package ex_15_Strings;

import java.util.Scanner;

public class Lab_Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        //String reverseStr = reverseString(input);

        String reverseStr1 = reverseStr(input);

        if (reverseStr1.equalsIgnoreCase(input))
            System.out.println(input + " is Palindrome");

        else
            System.out.println("Not palindrome");


    }

    static String reverseStr(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }


    //static String reverseString(String input){
    //   StringBuilder str = new StringBuilder(input);
    //   return str.reverse().toString();

    // }
}
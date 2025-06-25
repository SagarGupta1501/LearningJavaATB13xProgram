package ex_09_If_Condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_Vowel_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter the char");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toLowerCase().charAt(0);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println("Vowel is printing " + c);
            else
                System.out.println("Consonant is printing " + c);
        }else
            System.out.println("Invalid input");

    }
}

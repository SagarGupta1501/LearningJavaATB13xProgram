package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_CharAlphabet_Task {

    public static void main(String[] args) {
        System.out.println("Enter the char");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toLowerCase().charAt(0);
        if (c >= 'a' && c <= 'z'){
            System.out.println(c + " is Alphabet");
        }else
            System.out.println(c + " is not Alphabet");

    }
}

package ex_01_Java_Basics;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st no. ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd no. ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd no. ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is greater");
        }else if(b>c){
            System.out.println(b + " is greater");
        }else
            System.out.println(c + " is greater");

    }
}

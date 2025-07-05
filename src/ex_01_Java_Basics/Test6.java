package ex_01_Java_Basics;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. ");
        int a = sc.nextInt();

        if(a >= 0)
        {
            System.out.println(a + " is Positive");
        } else if (a <= 0) {
            System.out.println(a + " is Negative");
        }else if (a == 0){
            System.out.println(a + " is zero");
        }


    }
}

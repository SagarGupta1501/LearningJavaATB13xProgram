package ex_01_Java_Basics;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();


        int i = 1;

        int fact = 1;

        if(n == 0){
            System.out.println("The factorial is 1");
        }else {

            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println("The factorial is " + fact);
        }



    }
}

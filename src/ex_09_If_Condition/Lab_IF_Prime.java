package ex_09_If_Condition;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lab_IF_Prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int a = sc.nextInt();

        if(a<=1){
            System.out.println(a+ " is not prime number");
        }else if (a == 2){
            System.out.println(a+ " is prime number");
        }else if (a%2 == 0){
            System.out.println(a+ " is not prime number");
        }else {
            boolean isPrime = true;

        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

            if (isPrime) {
                System.out.println(a + " is a prime number");
            } else {
                System.out.println(a + " is not a prime number");
            }
        }




    }
}

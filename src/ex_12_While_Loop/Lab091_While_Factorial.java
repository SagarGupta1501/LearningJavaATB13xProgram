package ex_12_While_Loop;

import java.util.Scanner;

public class Lab091_While_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial num");
        if(!sc.hasNextInt()){
            System.out.println("Enter the integer");
            return;
        }

        int num = sc.nextInt();

        int fac = 1;

        if (num < 0) {
            System.out.println("Negative num factorial is not allowed");
            return;
        }
        if (num <=0)
            System.out.println(fac);
        else{
            // calculate the factorial
            for (int i = 1; i<=num ; i++){
                fac = fac * i;
            }
            System.out.println("Factorial is ->" + fac);

        }
    }

}

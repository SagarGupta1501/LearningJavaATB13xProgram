package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Electricity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units:");
        int units = sc.nextInt();

        double bill = 0.00d;


        if(units <=100){
           bill = units * 0.5;
            System.out.println("Bill is: " + bill);
        }else if(units<=200){
            bill = units * 0.75;
            System.out.println("Bill is: " + bill);
        }else if(units<=300){
            bill = units * 1.2;
            System.out.println("Bill is: " + bill);
        }else{
            bill = units * 1.5;
            System.out.println("Bill is: " + bill);
        }
    }
}

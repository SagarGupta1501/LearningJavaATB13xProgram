package ex_10_Switch;

import java.util.Scanner;

public class Lab067_Switch {
    public static void main(String[] args) {
        // Take user input to determine the day it is
        // 1-7 Mon - Sun
        // 8 -.... Not allowed or Error

        System.out.println("Enter the day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");

        }

    }
}

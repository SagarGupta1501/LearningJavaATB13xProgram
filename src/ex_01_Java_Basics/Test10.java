package ex_01_Java_Basics;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter the arth operator");
        String c = sc.next();
        System.out.println(c);

        switch(c){
            case "+":{
                System.out.println(a+b);
                break;
            }
            case "-":{
                System.out.println(a-b);
                break;
            }
            case "*":{
                System.out.println(a*b);
                break;
            }
            case "/":{
                switch(b) {
                    case 0:
                        System.out.println("B cannot be 0");
                        System.exit(0);
                    default: {
                        System.out.println(a / b);
                    }
                }
                break;
            }
            default:
                System.out.println("Invalid operator");
        }


    }
}

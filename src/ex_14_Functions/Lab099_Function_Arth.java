package ex_14_Functions;

import java.util.Scanner;

public class Lab099_Function_Arth {
    public static void main(String[] args) {
        // Create a Func of Sub, Sum, Mul, Div
        // with 2 parameters

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }else {
            System.out.println("Enter the int only");
            //return;
            System.exit(0);
        }
        System.out.println("Enter the num 2");
        int b = 0;
        if(sc.hasNextInt()) {
            b = sc.nextInt();
        }else {
            System.out.println("Enter the int only");
            return;
        }

        int sum = sum(a,b);
        System.out.println("Sum is ->" + sum);

        int sub = sub(a, b);
        System.out.println("Diff is ->" + sub);

        int mul = mul(a,b);
        System.out.println("Multiplication is ->" + mul);

        float div = div(a,b);
        System.out.println("Division is ->" + div);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static float div(int a, int b){
        if(b==0) {
            //throw new ArithmeticException("B cannot be 0");
            System.out.println("B cannot be 0");
            System.exit(0);
        }
        return a/b;
    }

}

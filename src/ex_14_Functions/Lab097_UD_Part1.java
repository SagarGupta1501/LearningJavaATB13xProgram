package ex_14_Functions;

import java.sql.SQLOutput;

public class Lab097_UD_Part1 {
    public static void main(String[] args) {
        wp_wr_greet();
        String msg = greet_wp_with_RT();
        System.out.println(msg);

        greet_with_details("sagar", 31, 2626.555);

        int sum = sum_of_two_nums(9,5);
        System.out.println("Sum of nums ->" + sum);
    }

    // 1. Without Parameters and Without Return Type
    static void wp_wr_greet(){
        System.out.println("Without Parameters and Without Return Type");
        System.out.println("Hi, How are you?");
    }

    // 2. Without Parameters but With Return Type
    static String greet_wp_with_RT(){
        System.out.println("Without Parameters but With Return Type");
        return "hi";
    }

    // 3. With Parameters and Without Return Type
    static void greet_with_details(String name, int age, double sal){
        System.out.println("With Parameters and Without Return Type");
        System.out.println("Your name is ->" + name);
        System.out.println("Your age is ->" + age);
        System.out.println("Your salary is ->" + sal);
    }

    // 4. With Parameters and With Return Type
    static int sum_of_two_nums(int a, int b){
        return a+b;
    }

}

package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab048_TO_Interview {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);

        int min = x < y ? x: y;
        System.out.println(min);

    }
}

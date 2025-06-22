package ex_06_Ternary_Operator;

public class Lab051_TO_Three_Max {
    public static void main(String[] args) {
        int a = 8;
        int b = 14;
        int c = -10;

        int max = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;
        System.out.println(max);
    }



}

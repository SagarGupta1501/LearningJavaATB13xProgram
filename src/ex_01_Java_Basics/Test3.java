package ex_01_Java_Basics;

public class Test3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        boolean d = a == b;
        boolean c = a > b;

        boolean e = a < b;
        boolean f = (a > b) && (a > 0);
        boolean g = (a < b) || (a > 0);
        boolean p = !(a > b);

        System.out.println("a == b " + d);
        System.out.println("a > b " + c);
        System.out.println("a < b " + e);
        System.out.println("(a > b) && (a > 0) " + f);
        System.out.println("(a < b) || (a > 0) " + g);
        System.out.println("!(a > b) " + p);




    }
}

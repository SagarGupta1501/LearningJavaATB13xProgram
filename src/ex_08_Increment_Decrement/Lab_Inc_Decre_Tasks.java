package ex_08_Increment_Decrement;

public class Lab_Inc_Decre_Tasks {
    public static void main(String[] args) {

        int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);

        int i = 1;

        i = i++ + ++i;

        System.out.println(i);

        int x = 5;

        System.out.println(x++ + ++x);

        int x1= 5;

        System.out.println(++x1);

        System.out.println(x1++);

        System.out.println(x1);

        int a1 = 5;

        int b1 = a1++ + ++a1;

        System.out.println("a: " + a1); // Output: ?

        System.out.println("b: " + b1); // Output: ?

        int x2 = 5;

        int y = x2++ + ++x2 + x2++ + ++x2;

        System.out.println("x = " + x2 + ", y = " + y);

    }
}

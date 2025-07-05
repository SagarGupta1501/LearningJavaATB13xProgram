package ex_01_Java_Basics;

public class Test5 {

    public static void main(String[] args) {
        int a = 10;
        float b = 3.5f;

        int c = ( a+ a) + (int)b;

        System.out.println("Expression result: " + c);

        float f = a + b;
        System.out.println("Implicit casting: " + f);

        int h = a + (int)b;
        System.out.println("Explicit casting: " + h);
    }





}

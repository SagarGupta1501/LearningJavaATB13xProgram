package ex_05_TypeCasting;

public class Lab043_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Narrowing - Implicit is not allowed

        byte b1 = (byte)val; // Narrowing - Explicit Casting
        // Data loss will be present in terms of Narrowing

        System.out.println(b1);
    }
}

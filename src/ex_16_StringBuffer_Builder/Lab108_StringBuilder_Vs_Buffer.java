package ex_16_StringBuffer_Builder;

public class Lab108_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");

        // Mutable
        StringBuffer strbuff = new StringBuffer("hello");
        StringBuilder strBuil = new StringBuilder("hello");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(strbuff);
        System.out.println(strBuil);
    }
}

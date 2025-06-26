package ex_15_Strings;

public class Lab106_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";

        String s10 = "Hello";

        // separate Object Area is assigned to each String
        String s3 = new String("Hello");
        String s4 = new String("hello");

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));


    }
}

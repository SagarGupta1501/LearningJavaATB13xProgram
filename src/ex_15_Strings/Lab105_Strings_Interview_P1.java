package ex_15_Strings;

public class Lab105_Strings_Interview_P1 {
    public static void main(String[] args) {
        // SCP will point to same Helloin the pool
        String s1 = "Hello";
        String s2 = "Hello";

        String s10 = "Hello";

        // separate Object Area is assigned to each String
        String s3 = new String("Hello");
        String s4 = new String("Hello");

    }
}

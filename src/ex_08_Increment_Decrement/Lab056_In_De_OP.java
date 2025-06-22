package ex_08_Increment_Decrement;

public class Lab056_In_De_OP {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++a; // 10+1 assigned // pre-increment

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

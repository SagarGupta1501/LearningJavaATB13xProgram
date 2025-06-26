package ex_16_StringBuffer_Builder;

public class Lab112_SB {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello");

        sb.delete(2,4);
        System.out.println(sb);

        sb.replace(0, 3, "Wrod");
        System.out.println(sb);
    }
}

package ex_16_StringBuffer_Builder;

public class Lab111_SBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

        sb.append("world");
        sb.reverse();
        System.out.println(sb);
    }
}

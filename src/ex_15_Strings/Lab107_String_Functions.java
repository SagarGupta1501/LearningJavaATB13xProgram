package ex_15_Strings;

public class Lab107_String_Functions {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1.length()); // length starts with 1
        System.out.println(s1.charAt(3)); // index strats with 0
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(2));

        System.out.println(s1.concat(s2));

        System.out.println(s1.contains("om"));

        System.out.println(s1.equals("Hello"));

        System.out.println((s1.equalsIgnoreCase("hello")));

        System.out.println(s1.indexOf('o'));

        System.out.println(s1.indexOf('e'));

        System.out.println(s1.lastIndexOf('l'));

        System.out.println(s1.replace('e', 'E'));

        String s3 = "hello@world@.com";
        String[] split_s3 = s3.split("@");

        System.out.println(split_s3[0]);
        System.out.println(split_s3[1]);
        System.out.println(split_s3[2]);

        //substring
        // 2 is included, but 4 is not included
        System.out.println(s1.subSequence(2,4));



    }

}

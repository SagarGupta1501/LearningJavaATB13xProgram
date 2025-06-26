package ex_15_Strings;

public class Lab100_String_Immutable {
    public static void main(String[] args) {

        String name = "Hello"; // String Content Pool
        //name.toUpperCase();
        name = name.toUpperCase(); // Another string is created in JVM
        System.out.println(name);

    }
}

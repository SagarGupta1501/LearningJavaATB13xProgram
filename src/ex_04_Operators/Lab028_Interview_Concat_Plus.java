package ex_04_Operators;

public class Lab028_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Sagar";
        String last_name = "Gupta";

        int a = 10;
        int b = 10;

        // a and b will not be added as the String is frot of the int
        System.out.println(first_name+last_name + a+ b);

        // a and b will br added as they are executing first
        System.out.println(a+b + first_name + last_name);

        System.out.println(first_name + last_name + (a+b));


    }
}

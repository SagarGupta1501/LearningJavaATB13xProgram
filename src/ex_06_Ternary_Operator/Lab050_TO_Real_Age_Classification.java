package ex_06_Ternary_Operator;

public class Lab050_TO_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 47;

        String result = (age < 18) ? "Minor" : (age  < 60) ? "adult" : "senior";
        System.out.println(result);

    }
}

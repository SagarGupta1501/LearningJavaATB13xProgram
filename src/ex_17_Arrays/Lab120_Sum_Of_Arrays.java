package ex_17_Arrays;

public class Lab120_Sum_Of_Arrays {
    public static void main(String[] args) {

        int[] numbers = {87, 55, 54};

        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }

        System.out.println(sum);
    }
}

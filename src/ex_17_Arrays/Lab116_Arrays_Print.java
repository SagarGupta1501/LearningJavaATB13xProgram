package ex_17_Arrays;

import java.util.Arrays;

public class Lab116_Arrays_Print {

    public static void main(String[] args) {

        int[] marks = {51, 96, 85, 77};
        // to sort the array
        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);


        }

        // to print the reference of marks
        System.out.println(marks);
    }
}

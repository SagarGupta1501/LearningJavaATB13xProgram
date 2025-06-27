package ex_17_Arrays;

import java.util.Arrays;

public class Lab117_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] marks = {87, 77, 55, 52, 48, 99, 75, 25};

        // to print max value
        //Arrays.sort(marks);
        //System.out.println(marks[marks.length - 1]);

        // to print max value without using inbuilt func

        int max = max_value(marks);
        System.out.println(max);

        int min = min_value(marks);
        System.out.println(min);

    }

    static int max_value(int[] marks){

        int max = marks[0];

            for (int i = 0; i < marks.length; i++) {
                if(marks[i] > max)
                    max = marks[i];
            }
                return max;
            }

    static int min_value(int[] marks){
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] < min)
                min = marks[i];
        }
        return min;
    }

}

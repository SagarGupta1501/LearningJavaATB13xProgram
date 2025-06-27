package ex_17_Arrays;

public class Lab123_Array_Copy {

    public static void main(String[] args) {

        int[] original_arr = {1, 2, 3};
        int[] copy = new int[original_arr.length];

        // to copy array into another array
        System.arraycopy(original_arr, 0, copy, 0, original_arr.length);

        for (int i = 0; i < original_arr.length; i++) {
            System.out.println(copy[i]);

        }
    }
}

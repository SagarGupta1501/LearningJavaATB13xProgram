package ex_17_Arrays;

public class Lab_Arrays_2ndLargest_Tasks {

    public static void main(String[] args) {

        int[] a = {15, 18, 26, 48, 22};
        int sec_largest = sec_Largest(a);
        System.out.println("Second Largest no. in array is " + sec_largest);
    }

    static int sec_Largest(int[] a) {

        int largest = 0;
        int second_largest = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if (a[i] > second_largest && largest != a[i]) {
                second_largest = a[i];

            }


        }
        return second_largest;
    }

}




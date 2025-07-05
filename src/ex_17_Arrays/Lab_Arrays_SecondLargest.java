package ex_17_Arrays;

public class Lab_Arrays_SecondLargest {

    public static void main(String[] args) {
        int[] numbers1 = {10, 5, 20, 15, 25};
        System.out.println("Second largest in numbers1: " + findSecondLargest(numbers1)); // Expected: 20

    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Handle cases where the array is null or has fewer than two elements
            // as a second largest cannot be determined.
            // One could throw an IllegalArgumentException or return a specific value like -1.
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // The previous largest becomes the second largest
                largest = arr[i];        // Current element is the new largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // If the current element is greater than secondLargest but not equal to largest,
                // it becomes the new secondLargest. This handles duplicates of the largest element.
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }


}

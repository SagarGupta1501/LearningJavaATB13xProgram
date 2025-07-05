package ex_01_Java_Basics;

public class Test14 {

    public static void main(String[] args) {

        for(int i = 1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            // print spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // move to the next line
        }


    }
}

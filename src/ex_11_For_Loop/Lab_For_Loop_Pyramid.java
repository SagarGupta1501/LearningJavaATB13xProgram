package ex_11_For_Loop;

public class Lab_For_Loop_Pyramid {

    public static void main(String[] args) {

        for(int i = 1; i<=3; i++){
            for (int j = i; j < 3; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }

            System.out.println();

        }
    }
}

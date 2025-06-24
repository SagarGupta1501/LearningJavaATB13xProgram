package ex_11_For_Loop;

public class Lab085_ForLoop_Continue_Even {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++)
            // even nums will be skipped
            if (i%2==0) {
                continue;
            }else
                System.out.println("Odd num ->" + i);
    }
}

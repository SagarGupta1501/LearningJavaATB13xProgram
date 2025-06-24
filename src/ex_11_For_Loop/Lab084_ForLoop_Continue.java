package ex_11_For_Loop;

public class Lab084_ForLoop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            // 5 will not be printed and loop continues
            if (i==5)
                continue;
            else
                System.out.println(i);


        }

    }
}

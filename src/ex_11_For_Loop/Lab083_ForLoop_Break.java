package ex_11_For_Loop;

public class Lab083_ForLoop_Break {
    public static void main(String[] args) {

        for (int i = 0; i<50 ; i++)
            if(i == 5)
            { //System.out.println(i);
                break;
            }else
                System.out.println(i);

    }
}

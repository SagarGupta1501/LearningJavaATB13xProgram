package ex_14_Functions;

public class Lab098_Main_Method_Overloading {
    public static void main(String[] args) {
        int m = main(5);
        System.out.println(m);
    }

    public static int main (int args)
    {return 10;
    }

    public static void main(String args){}
}

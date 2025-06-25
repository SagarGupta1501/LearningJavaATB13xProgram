package ex_14_Functions;

public class Lab096_User_Defined_One {
    public static void main(String[] args) {
        int result = sum(7,8);
        System.out.println(result);
        sum2(8,2);
    }

    static int sum(int a, int b){
        return a+b;
    }
    // void cannot return
    static void sum2(int a, int b){
        System.out.println(a+b);

    }
}

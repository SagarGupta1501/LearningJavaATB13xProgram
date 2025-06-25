package ex_14_Functions;

public class Lab095_Simple_Method {
    public static void main(String[] args) {

        int a = return_int();
        System.out.println(a);

        boolean b = return_boolean();
        System.out.println(b);

        float f = return_float();
        System.out.println(f);


    }
    static int return_int(){
        System.out.println("This will return int");
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float(){
        return 3.14f;
    }
}

package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab141_Poly_MethodOverloading {
    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        int r1 = m.add(9,5);
        int r2 = m.add(7,5,6);
        double r3 = m.add(85.15, 63.24);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}

class MathOperation{

    int add (int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }


}
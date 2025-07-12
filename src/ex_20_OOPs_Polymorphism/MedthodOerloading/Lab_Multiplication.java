package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab_Multiplication {

    public static void main(String[] args) {

        CalcMultiple cm = new CalcMultiple();

        int m = cm.multiply(8,6);
        int m1 = cm.multiply(5,3,9);

        System.out.println(m);
        System.out.println(m1);
    }
}

class CalcMultiple{

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }
}

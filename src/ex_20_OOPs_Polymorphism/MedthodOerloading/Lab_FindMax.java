package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab_FindMax {

    public static void main(String[] args) {

        MaximumOfNum mn = new MaximumOfNum();

        System.out.println(mn.max(8,55));
        System.out.println(mn.max(9,4,6));
        System.out.println(mn.max(98.65,35.45));

    }
}

class MaximumOfNum{

    int max(int a, int b){
        if(a>b){
            return a;
        }else
            return b;
    }

    int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else
            return c;
    }

    double max(double a, double b){
        if(a>b){
            return a;
        }else
            return b;
    }

}
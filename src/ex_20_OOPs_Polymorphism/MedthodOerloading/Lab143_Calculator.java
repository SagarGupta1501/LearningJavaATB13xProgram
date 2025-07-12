package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab143_Calculator {

    public static void main(String[] args) {

        Calc c = new Calc();

        int add1 = c.add(8,5);
        double add2 = c.add(9.494,58.8);

        System.out.println(add1);
        System.out.println(add2);

    }

}


class Calc{

   int add(int a, int b){
       return a+b;
   }

   double add(double a, double b){
       return a+b;
   }

}
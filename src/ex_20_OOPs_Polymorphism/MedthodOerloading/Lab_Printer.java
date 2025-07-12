package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab_Printer {

    public static void main(String[] args) {
        Print p = new Print();

        int c = p.printData(665);
        String s = p.printData("Printing");
        float f = p.printData(565.544f);

        System.out.println(c);
        System.out.println(s);
        System.out.println(f);
    }
}

class Print{

    String printData(String data){
        return data;
    }

    int printData(int data){
        return data;
    }

    float printData(float data){
        return data;
    }



}
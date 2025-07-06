package ex_19_Inheritance.SingleInheritance;



public class Lab139_Real_SI extends CommonToAll{

    public static void main(String[] args) {

        TestCase1 tc1 = new TestCase1();
        tc1.running();

        // Dynamic Dispatch
        CommonToAll cm = new TestCase1();


    }
}


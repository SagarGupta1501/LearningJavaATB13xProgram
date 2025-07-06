package ex_19_Inheritance;

public class Lab138_Inheritance {

    public static void main(String[] args) {

        Son s = new Son();

        System.out.println(s.gold);
        s.bhk2();
        s.bhk3();

    }

}

class Father{

    int gold = 1000;

    void bhk2(){
        System.out.println("2bhk");
    }
}

class Son extends Father{

    void bhk3(){
        System.out.println("3bhk");
    }

}
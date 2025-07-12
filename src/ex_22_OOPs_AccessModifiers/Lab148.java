package ex_22_OOPs_AccessModifiers;

public class Lab148 {

    public static void main(String[] args) {

        Son s = new Son();
        s.canUser();

    }

}

class Father{

    private int gold = 4544;
    int car = 18;
    public int bhk3 = 85;

}


class Son extends Father{

    void canUser(){
        System.out.println(car);
        System.out.println(bhk3);
    }

}
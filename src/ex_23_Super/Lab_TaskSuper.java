package ex_23_Super;

public class Lab_TaskSuper {

    public static void main(String[] args) {

        SuperChild sc= new SuperChild();
        sc.surprise();
    }

}


class SuperCons{

    int a = 10;

    private int b = 11;

    SuperCons(){
        System.out.println("Parent");
    }

    void surprise(){
        System.out.println("Method super");
        System.out.println(b);
    }
}

class SuperChild extends SuperCons{

    SuperChild(){
        super();
        System.out.println("Child");
    }

    void surprise(){
        super.surprise();
        System.out.println(super.a);
        System.out.println("Method child");
    }


}
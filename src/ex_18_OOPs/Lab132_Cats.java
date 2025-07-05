package ex_18_OOPs;

public class Lab132_Cats {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.running();
        new Cat().running();

    }

}

class Cat{

    String name;

    void running(){
        System.out.println("Running");
    }

}

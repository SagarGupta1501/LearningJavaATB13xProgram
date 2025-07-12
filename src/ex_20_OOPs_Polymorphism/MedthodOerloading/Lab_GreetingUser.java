package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab_GreetingUser {

    public static void main(String[] args) {

        Greetings g = new Greetings();

        System.out.println(g.greet());
        System.out.println(g.greet("Lucky"));
    }
}

class Greetings{

    String greet(){
        return "hello";
    }

    String greet(String name){
        return "hello "+name;

    }

}

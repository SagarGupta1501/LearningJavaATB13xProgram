package ex_18_OOPs;

public class Lab137_Constructor_Overloading {

    public static void main(String[] args) {

        Man m = new Man();

        Man m1 = new Man("Lucky");
        System.out.println(m1.name);

        Man m2 = new Man("Gugu", 25);
        System.out.println(m2.name);
        System.out.println(m2.age);

        Man m3 = new Man(646546465);
        System.out.println(m3.phone);


    }
}

class Man{

    String name;
    int age;
    long phone;

    Man(){

        System.out.println("DC");
    }

    Man(String user_name){
        this.name = user_name;
    }

    Man(String user_name, int age){
        this.name = user_name;
        this.age = age;
    }

    Man(long user_phone){
        this.phone = user_phone;
    }


}

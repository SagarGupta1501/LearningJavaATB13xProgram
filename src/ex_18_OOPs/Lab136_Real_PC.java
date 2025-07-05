package ex_18_OOPs;

public class Lab136_Real_PC {

    public static void main(String[] args) {

        Person1 p = new Person1("Lucky", 25, 56489796);

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.phone);

    }
}

class Person1{
    String name;
    int age;
    long phone;

    Person1(String user_name, int user_age, long user_phone){

        this.name = user_name;
        this.age = user_age;
        this.phone = user_phone;
    }
}
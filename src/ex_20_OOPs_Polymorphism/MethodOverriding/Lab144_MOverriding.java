package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab144_MOverriding {

    public static void main(String[] args) {

       Dog d = new Dog();
        d.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("Default");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark");
    }
}
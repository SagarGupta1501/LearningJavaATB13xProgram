package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab_AnimalSounds {

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.sound();

        Cat1 c = new Cat1();
        c.sound();

        Cow co = new Cow();
        co.sound();

    }
}

class Animal1{

    void sound(){
        System.out.println("Default");
    }
}

class Dog1 extends Animal1{

    @Override
    void sound(){
        System.out.println("Bark");
    }
}

class Cat1 extends Animal1{

    @Override
    void sound(){
        System.out.println("Meow");
    }
}

class Cow extends Animal1{

    @Override
    void sound(){
        System.out.println("Moo");
    }
}

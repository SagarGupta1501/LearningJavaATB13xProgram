package ex_22_OOPs_AccessModifiers;

public class Lab_Task_Protected {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.doEat();

        Student1 s = new Student1();
        s.showInfo();

    }
}


class Animal{

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    void doEat(){
        eat();
    }
}
package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab_Vehicle_Starting {

    public static void main(String[] args) {

        Bike1 b = new Bike1();
        b.start();

        Car1 c = new Car1();
        c.start();

    }
}

class Vehicle1{

    void start(){
        System.out.println("starting");
    }
}

class Bike1 extends Vehicle1{

    @Override
    void start(){
        System.out.println("Bike starting");
    }
}

class Car1  extends Vehicle1{

    @Override
    void start(){
        System.out.println("Car starting");
    }
}
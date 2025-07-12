package ex_23_Super;

public class Lab149_SuperKeyword {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car(10);
        c1.display();

    }
}

class Vehicle{

    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Parent DC");
    }
    Vehicle(int m){
        System.out.println("Parent PC" + m);
    }

    void message(){
        System.out.println("Type 1");
    }

    void message(int a){
        System.out.println("Type 2");
    }

    void display(){
        System.out.println("Display");
    }

}

class Car extends Vehicle{

    private int maxSpeed = 255;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
        super();
        System.out.println("Child DC");

    }

    Car(int a){
        super(10);
        System.out.println("Child PC");

    }

    @Override
    void display(){
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        System.out.println("Child display");
    }

}

package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab_Employees {

    public static void main(String[] args) {

        Manager m = new Manager();
        m.role();

        Clerk c = new Clerk();
        c.role();

        Tester t = new Tester();
        t.role();


    }
}

class Employee{

    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{

    void role(){
        System.out.println("Manager");
    }
}

class Clerk extends Employee{

    void role(){
        System.out.println("Clerk");
    }
}

class Tester extends Employee{

    void role(){
        System.out.println("Tester");
    }
}
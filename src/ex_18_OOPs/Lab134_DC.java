package ex_18_OOPs;

public class Lab134_DC {
    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.name);
        System.out.println(c.model);
        System.out.println(c.year);

    }
}

class Car{

    String name;
    int year;
    String model;

    Car(){

        name = "Honda";
        model = "Civic";
        year = 2019;

    }


}

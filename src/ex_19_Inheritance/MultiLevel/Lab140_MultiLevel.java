package ex_19_Inheritance.MultiLevel;

public class Lab140_MultiLevel {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        Father f = new Father();

        f.f();
        f.gf();

        Son s = new Son();

        s.gf();
        s.f();
        s.s();

        GrandFather gf1 = new Son();
        gf1.gf();
        // whatever the object is created, for that the method will be called
        gf1.home();

        GrandFather gf2 = new Father();
        gf2.home();


    }


}

package ex_22_OOPs_AccessModifiers;

public class Lab_TestDefaults {

    public static void main(String[] args) {

        Student s = new Student();

        s.showDetails();

    }

}

class Student{

    void showDetails(){
        System.out.println("default method");
    }

}

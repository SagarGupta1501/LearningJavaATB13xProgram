package ex_18_OOPs;

public class Lab131_Constructors {

    public static void main(String[] args) {

        Student s = new Student();

        new Student();
    }

}


class Student{
    String name;
    int roll_no;

    // Default constructor - Same name as Class
    Student(){
        System.out.println("DC");
        name = "Lucky";
        roll_no = 5;
        System.out.println(name);
        System.out.println(roll_no);
    }

    public void study(){
        System.out.println("Studying");
    }

}
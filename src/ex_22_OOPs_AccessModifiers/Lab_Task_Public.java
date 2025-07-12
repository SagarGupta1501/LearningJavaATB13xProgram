package ex_22_OOPs_AccessModifiers;

public class Lab_Task_Public {

    public static void main(String[] args) {

        Student1 s = new Student1();
        s.showInfo();

    }
}

class Student1 {

    public void showInfo(){
        System.out.println("Show info");
    }
}
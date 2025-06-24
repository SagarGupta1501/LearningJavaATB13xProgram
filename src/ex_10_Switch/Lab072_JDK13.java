package ex_10_Switch;

public class Lab072_JDK13 {
    public static void main(String[] args) {

        int a = 006;

        switch(a){
            case 001, 002, 003:
                System.out.println("they are matching");
                break;
            case 004, 005, 006:
                System.out.println("They are matching with a");
                break;
            default:
                System.out.println("Nothing is matching");


        }
    }
}

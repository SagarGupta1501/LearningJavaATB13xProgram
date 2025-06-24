package ex_10_Switch;

public class Lab071_JDK13Above {
    public static void main(String[] args) {
        // in JDK > 13
        // NO need of break when only 1 statement
        int a = 002;

        switch (a){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            default -> System.out.println("default");
        }
    }
}

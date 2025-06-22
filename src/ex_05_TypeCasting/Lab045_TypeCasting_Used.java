package ex_05_TypeCasting;

public class Lab045_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course + (int)GST; // data loss will be there
          float total = course + GST;
        System.out.println(total);


    }
}

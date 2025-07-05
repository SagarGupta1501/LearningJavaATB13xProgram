package ex_18_OOPs;

public class Lab135_PC {
    public static void main(String[] args) {

        Baby b = new Baby();

        Baby b1 = new Baby("Lucky", "55466546", 2024);
        System.out.println(b1.name);
        System.out.println(b1.adhar);
        System.out.println(b1.year);

    }
}

class Baby{

    String name;
    String adhar;
    int year;

    Baby(){

        name = "Gugu";
        adhar = "66464";
        year = 2025;
    }

    Baby(String user_name, String user_adhar, int user_year){

        name = user_name;
        adhar = user_adhar;
        year = user_year;
    }



}

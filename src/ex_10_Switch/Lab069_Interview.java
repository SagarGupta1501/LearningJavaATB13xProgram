package ex_10_Switch;

import java.sql.SQLOutput;

public class Lab069_Interview {
    public static void main(String[] args) {
        int a = 10;
        //int is allowed
        switch(a){

        }

        char ch = 'A';
        switch(ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("NO Match");
        }
    }
}

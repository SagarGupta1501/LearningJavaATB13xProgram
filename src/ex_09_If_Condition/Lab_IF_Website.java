package ex_09_If_Condition;

import java.util.Scanner;

public class Lab_IF_Website {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of website domain");
        String website = sc.next();

        if(website.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(website.endsWith(".org")){
            System.out.println("Organisational Website");
        }else if(website.endsWith(".edu")){
            System.out.println("Educational institution");
        }else if(website.endsWith(".gov")){
            System.out.println("Government website");
        }else if(website.endsWith(".net")){
            System.out.println("Network-related website");
        }else if(website.endsWith(".info")){
            System.out.println("Informational website");
        }else
            System.out.println("Unknown or other types of websites");
    }
}

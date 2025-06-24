package ex_10_Switch;

import java.util.Scanner;

public class Lab068_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // User inputs which browser to use

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Chrome is started");
                break;
            case "firefox":
                System.out.println("Firefox is started");
                break;
            case "edge":
                System.out.println("Edge is started");
                break;
            default:
                System.out.println("not sure which browser");
        }
    }
}

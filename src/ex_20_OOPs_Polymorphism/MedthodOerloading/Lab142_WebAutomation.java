package ex_20_OOPs_Polymorphism.MedthodOerloading;

public class Lab142_WebAutomation {

    public static void main(String[] args) {

        Browser b1 = new Browser();

        b1.startBrowser();
        b1.startBrowser("Chrome");

    }

}

class Browser{

    void startBrowser(){
        System.out.println("Start default browser");

    }

    void startBrowser(String browser){
        System.out.println("Starting browser" + browser);
    }

    int startBrowser(int browser){
        return browser;
    }
}
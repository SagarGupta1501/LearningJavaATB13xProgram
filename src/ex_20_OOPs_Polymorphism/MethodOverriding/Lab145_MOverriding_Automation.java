package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab145_MOverriding_Automation {

    public static void main(String[] args) {

        Chrome c = new Chrome();
        c.openBrowser();

        CommonToAll c1 = new Chrome();
        c1.openBrowser();
    }
}


class CommonToAll{

    void openBrowser(){
        System.out.println("Open IE");
    }

}

class Chrome extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Chrome");
    }


}
package ex_21_OOPs_Encapsulation;

public class Lab147_RealBank {

    public static void main(String[] args) {

        ICICI ic = new ICICI("Lucky", 654545);

        System.out.println(ic.getName());
        System.out.println(ic.getBal());

        ic.setBal(87455, true);

        System.out.println(ic.getBal());

    }

}


class ICICI{

    String name;
    int bal;

    ICICI(String name, int bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBal(){
        return bal;
    }

    public void setBal(int bal, boolean isCashier){
        if(isCashier) {
            this.bal = bal;
        }else
            System.out.println("cannot update balance");
    }


}

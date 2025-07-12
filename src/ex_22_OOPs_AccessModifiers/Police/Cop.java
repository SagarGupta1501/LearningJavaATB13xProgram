package ex_22_OOPs_AccessModifiers.Police;

public class Cop {

    int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void canIShoot(){
        System.out.println("Yes");
    }

}

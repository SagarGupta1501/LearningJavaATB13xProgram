package ex_21_OOPs_Encapsulation;

public class Lab146_OOPs_Encapsulation {

    public static void main(String[] args) {

        VWOLogin vw = new VWOLogin("test", "test1234");

        System.out.println(vw.getPassword());

        vw.setPassword("teetst13", true);

        System.out.println(vw.getPassword());

    }


}

class VWOLogin{

    private String username;
    private String password;

    VWOLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else
            System.out.println("cannot set the password");
    }
}

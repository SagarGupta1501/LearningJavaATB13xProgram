package ex_20_OOPs_Polymorphism.MethodOverriding;

public class Lab_User_Login {

    public static void main(String[] args) {

        Login1 ad = new AdminUser();
        ad.login();

        Login1 ru = new RegularUser();
        ru.login();

    }
}

class Login1{

    void login(){
        System.out.println("User login");
    }
}
class AdminUser extends Login1{

    void login(){
        System.out.println("Admin User");
    }
}

class RegularUser extends Login1{

    void login(){
        System.out.println("Regular User");
    }
}

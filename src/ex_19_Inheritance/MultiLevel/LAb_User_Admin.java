package ex_19_Inheritance.MultiLevel;

public class LAb_User_Admin {

    public static void main(String[] args) {

        SuperAdmin sa = new SuperAdmin();
        sa.shutdownSystem();
        sa.accessAdminPanel();
        sa.login();

        AdminUser au = new SuperAdmin();

        au.accessAdminPanel();
        au.login();

        User u = new SuperAdmin();
        u.login();

    }
}

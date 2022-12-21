package OOPS.InterfaceDemo.OnClickListner;

public class Main {
    public static void main(String[] args) {
        Button btnLogin = new Button();
        btnLogin.setOnClickListner(new OnClickLister() {
            @Override
            public void onClick() {
                System.out.println("User is logged in");
            }
        });

        Button btnLogout = new Button();
        btnLogout.setOnClickListner(new OnClickLister() {
            @Override
            public void onClick() {
                System.out.println("User is logged out");
            }
        });
    }
}

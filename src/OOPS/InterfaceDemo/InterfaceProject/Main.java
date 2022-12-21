package OOPS.InterfaceDemo.InterfaceProject;

public class Main {
    public static void main(String[] args) {
        DeskPhone myPhone = new DeskPhone("123456");
        myPhone.powerOn();
        myPhone.callPhone("123456");
        myPhone.answer();

        MobilePhone myMobilePhone = new MobilePhone("123456");
        myMobilePhone.powerOn();
        myMobilePhone.callPhone("123456");
        myMobilePhone.answer();
    }
}

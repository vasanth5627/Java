package OOPS.InterfaceDemo.InterfaceProject;

public interface Telephone {
    //power on
    //dail a number
    //answer a phone call
    //call another phone
    //is ringing


    void powerOn();
    void dail(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}

package OOPS.InterfaceDemo.InterfaceProject;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("Mobile Phone Powered On");
    }

    @Override
    public void dail(String phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on Mobile Phone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the Mobile Phone");
            isRinging=false;
        }
        else{

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn){
            isRinging=true;
            System.out.println("Phone is ringing");
        }
        else{
            isRinging=false;
            System.out.println("Either Wrong Number or Phone is OFF");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

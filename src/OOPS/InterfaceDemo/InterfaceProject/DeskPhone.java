package OOPS.InterfaceDemo.InterfaceProject;

import java.awt.image.renderable.RenderableImage;

public class DeskPhone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered");
    }

    @Override
    public void dail(String phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on deskPhone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the DeskPhone");
        }
        else{
            System.out.println("Phone is not Ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Phone is Ringing");
        }
        else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

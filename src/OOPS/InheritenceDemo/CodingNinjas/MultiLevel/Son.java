package OOPS.InheritenceDemo.CodingNinjas.MultiLevel;

public class Son extends Father{
    String sonName;

    public Son(String grandFatherName, String fatherName, String sonName) {
        super(grandFatherName, fatherName);
        this.sonName = sonName;
    }
    void printName(){
        System.out.println("sonname: "+this.sonName);
        System.out.println("fathername: "+this.fatherName);
        System.out.println("grandfather: "+this.grandFatherName);
    }
}

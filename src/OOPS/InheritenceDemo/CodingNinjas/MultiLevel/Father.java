package OOPS.InheritenceDemo.CodingNinjas.MultiLevel;

public class Father extends GrandFather{
    String fatherName;

    public Father(String grandFatherName, String fatherName) {
        super(grandFatherName);
        this.fatherName = fatherName;
    }

}

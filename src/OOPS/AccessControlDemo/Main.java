package OOPS.AccessControlDemo;



public class Main {
    public static void main(String[] args) {
        AccesControl obj = new AccesControl(10,"vasanth");
        //Access and modify the data members
        obj.setNum(30);
        System.out.println(obj.getNum());
        System.out.println(obj.arr.length);
    }
}

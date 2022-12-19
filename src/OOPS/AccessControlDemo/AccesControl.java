package OOPS.AccessControlDemo;

public class AccesControl {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;
    String name;
    int[] arr;

    public AccesControl(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}

 class ObjectDemo  extends  AccesControl{
    int num;
    int val;


     public ObjectDemo(int num, String name, int num1, int val) {
         super(num, name);
         this.num = num1;
         this.val = val;
     }

     @Override
     public int hashCode() {
         return super.hashCode();//number representaion of an object
     }

     @Override
     public boolean equals(Object obj) {
         return this.num == ((ObjectDemo)obj).num;
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     @Override
     public String toString() {
         return super.toString();
     }



     public static void main(String[] args) {
         ObjectDemo obj1 = new ObjectDemo(10,"vasanth",10,10);
         ObjectDemo obj2 = new ObjectDemo(10,"Kumar",10,10);
         if(obj1==obj2){
             System.out.println("==");
         }
         if(obj1.equals(obj2)){
             System.out.println("equals");
         }
         System.out.println(obj1 instanceof ObjectDemo);
         System.out.println(obj1 instanceof AccesControl);
     }
 }


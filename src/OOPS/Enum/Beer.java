package OOPS.Enum;

enum Beer{
    KF(100),KO(65),RC(90),FO(200);
    int price;
    Beer(int price){
       this.price = price;
    }

    int getPrice(){
        return this.price;
    }
}

class  Test{
    public static void main(String[] args) {
        Beer b  = Beer.KF;
        System.out.println(b.getPrice());
        System.out.println("hell0");
    }
}

enum Fish{
    Gold,Guppy,STAR;

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
package InnerClasses.Anonymous;

public class Main {
    public static void main(String[] args) {
        Popcorn p = new Popcorn();
        p.taste();
        Popcorn p1 = new SubPopcorn();
        p1.taste();

        Popcorn p2 = new Popcorn(){
            public void taste(){
                System.out.println("caramel");
            }
        };
        p2.taste();

        Popcorn p3 = new Popcorn(){
            public void taste(){
                System.out.println("New Flavour");
            }
        };
        p3.taste();

        System.out.println(p.getClass().getName());
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
        System.out.println(p3.getClass().getName());

    }
}

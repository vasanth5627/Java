package InnerClasses.NestedClass;

public class Nested {
    int n=1001;
    class inner{
        int x =20;
        public  void m1(){
            System.out.println("Inside Inner");
            System.out.println(n);
        }
        public static void m2(){
            System.out.println("Inside Inner static");
        }
    }
    static class Nest{
        int y=10;
        static int z =100;
        public  void m1(){
            System.out.println("Inside nest");

        }
        public static void m2(){
            System.out.println("Inside nest static");
        }
        class inst{
            int x =-10;
            public  void m1(){
                System.out.println("Inside inst");
            }
            public static void m2(){
                System.out.println("Inside inst static");
            }

        }
        static class sti{
            int x =100;
            public  void m1(){
                System.out.println("Inside sti");
            }
            public static void m2(){
                System.out.println("Inside sti static");
            }
        }

    }
}

package InnerClasses.NestedClass;

public  class Test {
    static class stTest{
        public static void main(String[] args) {
            System.out.println("stTest main Method");
        }
        int x;
        stTest(){
            this.x= 10;
        }
        public  void m1(){
            System.out.println("Inside static stTest non-static");
        }
        public  static  void m2(){
            System.out.println("Inside static stTest static");
        }
        class inTest{
            public  void m1(){
                System.out.println("inside instance inTest non-static");
            }
            public  static  void m2(){
                System.out.println("Inside instance inTest static");
            }
        }
    }
    class instTest{
        public  void m1(){
            System.out.println("Inside static stTest non-static");
        }
        public  static  void m2(){
            System.out.println("Inside static stTest static");
        }
        class inTest{
            public  void m1(){
                System.out.println("inside instance inTest non-static");
            }
            public  static  void m2(){
                System.out.println("Inside instance inTest static");
            }
        }
    }
}

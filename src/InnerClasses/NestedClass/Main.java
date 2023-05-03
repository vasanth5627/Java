package InnerClasses.NestedClass;



public  class Main {
    public static void main(String[] args) {
        Nested.Nest.m2();
        Nested.Nest.z=10;
        Nested.Nest n  = new Nested.Nest();
        n.m1();
        n.y=30;
        System.out.println(n.y);
        Nested.Nest n1  = new Nested.Nest();
        System.out.println(n1.y);

        Nested.Nest.sti.m2();
        Nested.Nest.sti sti = new Nested.Nest.sti();
        sti.m1();

        Nested ne = new Nested();
        Nested.Nest nx = new Nested.Nest();

        System.out.println(nx.getClass().getName());
        Test.stTest ts = new Test.stTest();
        System.out.println(ts.x);




    }
}

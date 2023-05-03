package InnerClasses.Regular;

public class Vehicle {
    private drive d;
    interface drive{
        public  void drive();
    }
    class Bus implements drive{
        @Override
        public void drive() {
            System.out.println("Bus drive");
        }
    }

    public static void main(String[] args) {
      Vehicle.Bus b = new Vehicle().new Bus();
      b.drive();


    }
}

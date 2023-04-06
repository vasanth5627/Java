package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
//        try{
//            System.out.println("try");
////            System.out.println(arr[3]);
////            int i = 10/0;
//            return;
//
//        }
//
//        catch (ArithmeticException e){
//            System.out.println(e.toString());
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.toString());
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("finally block");
//        }

//        int j = 10/0;
        System.out.println("stmt");

        try{
            int i=1/0;
        }
        catch (Exception e){

        }


    }
}

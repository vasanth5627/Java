package ExceptionHandling;

import java.io.PrintWriter;

public class ThrowException {

    public static void main(String[] args){
//        ArithmeticException e = new ArithmeticException();
//        try{
//            System.out.println(10/0);
//        }
//        catch (ArithmeticException f){
//            throw f;
//        }
//
//        try{
//
//        }
//        finally{
//            System.out.println("hello");
//        }

        int age = 30;
        if(age>60){
            throw  new YoundExc("Too Young");
        }
        else if(age<18){
            throw  new OldExc("Too Old");
        }
        else{
            System.out.println("thanks for registering");

        }

    }
}

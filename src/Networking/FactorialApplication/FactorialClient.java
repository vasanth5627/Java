package Networking.FactorialApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",9090);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter a number to calculate Factorial");
            Integer val =  Integer.parseInt(bufferedReader.readLine());
            PrintWriter out  = new PrintWriter(socket.getOutputStream(),true);
            out.println(val);
            BufferedReader ans = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(ans.readLine());
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}

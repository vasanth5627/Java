package Networking.FactorialApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            System.out.println("Factorial Server Started");
            ServerSocket  serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Integer val = Integer.parseInt(bufferedReader.readLine());
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            out.println(factorial(val));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Integer factorial(Integer val) {
        if(val==0 || val==1) return 1;
        return val*factorial(val-1);
    }


}

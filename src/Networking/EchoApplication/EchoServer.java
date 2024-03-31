package Networking.EchoApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Waiting for Clients");
            ServerSocket ss = new ServerSocket(9010);
            Socket socket = ss.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            out.println("Server says: "+str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

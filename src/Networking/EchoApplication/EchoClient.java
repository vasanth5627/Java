package Networking.EchoApplication;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket socket = new Socket("localhost",9010);
            System.out.println("enter a message");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str  = userInput.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

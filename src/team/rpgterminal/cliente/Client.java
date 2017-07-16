package team.rpgterminal.cliente;

import java.io.*;
import java.net.Socket;

/**
 * Created by NJSilva on 15/07/2017.
 */
public class Client {

    private Socket clientSocket;
    private String hostName = "127.0.0.1";
    private int portNumber = 5000;

    public Client() {


    }

    public void startClient() throws IOException {
        clientSocket = new Socket(hostName,portNumber);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("RECEIVED STRING: ");
        while(!in.ready()){
            System.out.println(in.readLine());
            System.out.println();
            in.close();
        }
    }

    public void closeClient() throws IOException {
        clientSocket.close();
    }
}

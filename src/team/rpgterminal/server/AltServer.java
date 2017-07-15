package team.rpgterminal.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by NJSilva on 15/07/2017.
 */
public class AltServer {

    private final int PORT_NUMBER = 6969;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public AltServer() {

    }

    public void startConnection() throws IOException {
        PrintWriter out;
        BufferedReader in;

        serverSocket = new ServerSocket(PORT_NUMBER);
        clientSocket = serverSocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream(),true);
        in= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


    }


}

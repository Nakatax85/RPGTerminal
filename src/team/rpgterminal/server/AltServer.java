package team.rpgterminal.server;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

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

    private ServerSocket serverSocket;
    private Socket clientSocket;

    public void startServer() throws IOException {
        serverSocket=new ServerSocket();
        clientSocket = serverSocket.accept();
        System.out.println("CONNECTION ESTABLISHED");

        PrintWriter output = new PrintWriter(clientSocket.getOutputStream());

    }


}

package team.rpgterminal.server;

import team.rpgterminal.cliente.ClientLauncher;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class Server {

    private ServerSocket serverSocket = null;

    public void launch(String hostname, int port) {

        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void startConnection(){

        Socket socket = null;

        try {
            while((socket = serverSocket.accept()) == null) {



            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void closeClientConnection(){

    }

    private void watchClient(ClientLauncher client){

    }
}

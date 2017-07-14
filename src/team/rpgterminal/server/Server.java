package team.rpgterminal.server;

import team.rpgterminal.cliente.ClientLauncher;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 */
public class Server {

    private ServerSocket serverSocket = null;
    private Map<Integer, Connection> clients = new HashMap<Integer, Connection>();
    private static Integer ID = 1;

    public void launch(int port) {

        try {
            serverSocket = new ServerSocket(port);

            startConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void startConnection(){

        Socket socket = null;

        try {
            while(true) {
                socket = serverSocket.accept();

                Executor exec = Executors.newCachedThreadPool();
                clients.put(ID, new Connection(socket));
                exec.execute(clients.get(ID));
                ID = ID + 1;

                socket = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void closeClientConnection() {



    }

    private void watchClient(ClientLauncher client){

    }
}

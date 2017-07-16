package team.rpgterminal.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by codecadet on 16/07/2017.
 */
public class Client{


    private Socket socket;
    private final int port = 6969;
    private final String host = "localhost";
    private BufferedReader terminalInput;
    private BufferedReader serverInput;


    public Client() {
        try {
            socket = new Socket(host, port);
            terminalInput = new BufferedReader(new InputStreamReader(System.in));
            serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(serverInput);

        } catch (IOException e) {
            System.err.println("ERROR: Network Failure: " + e.getMessage());
        }

    }

    public void clientConnection() {

        Thread t = new Thread(new ClientDispatcher());
        t.start();


        while (true) {
            try {
                String msg = serverInput.readLine();

                if (msg == null) {
                    break;
                }

                System.out.println(msg);


            } catch (IOException e) {
                System.err.println("ERROR: Network Failure: " + e.getMessage());
            }
        }
    }


    public class ClientDispatcher implements Runnable {

        @Override
        public void run() {

            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream());

                while (true) {
                    String response = terminalInput.readLine();
                    out.write(response);
                    out.write("\n");
                    out.flush();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }


        }

    }
}











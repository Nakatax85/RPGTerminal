package team.rpgterminal.server;

import team.rpgterminal.cliente.game.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by NJSilva on 15/07/2017.
 */
public class AltServer {

    private ServerSocket serverSocket;
    private final int port = 6969;
    private Connection connection;
    private List<ClientHandler> clientList;
    private static Integer ID = 0;



    public AltServer() {
        try {
            serverSocket = new ServerSocket(port);
            clientList = new CopyOnWriteArrayList<>();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void start() {

        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();


                Executor executor = Executors.newCachedThreadPool();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientList.add(clientHandler);
                executor.execute(clientList.get(ID));
                ID = ID++;

                Thread t = new Thread(clientHandler);

                t.start();

            } catch (IOException e) {
                System.err.println(e.getMessage());
                break;
            }
        }
    }

    public void sendAll(String message) {

        for (ClientHandler ch : clientList) {
            ch.send(message);
        }
    }

    public class ClientHandler implements Runnable {

        private BufferedReader in;
        private PrintWriter out;
        private String userName;

        public ClientHandler(Socket socket) {

            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream());

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        public void send(String broadcastMessage) {
            out.write(broadcastMessage);
            out.write("\n");
            out.flush();
        }

        public String getUserName() {
            return userName;
        }

        @Override
        public void run() {

           connection.run();

            try {
                userName = in.readLine();

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

            while (true) {
                try {

                    String message = in.readLine();
                    String[] messagePM = message.split(" ");
                    if (message == null) {
                        break;
                    }

                    if (messagePM[0].equals("/pm")) {

                        for (ClientHandler ch : clientList) {
                            if (ch.getUserName().equals(messagePM[1])) {
                                message = message.substring(message.indexOf(" ") + 1);
                                message = message.substring(message.indexOf(" "));
                                ch.send(message);
                                break;
                            }
                        }
                        continue;
                    }

                    sendAll(userName + ": " + message);

                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }


}

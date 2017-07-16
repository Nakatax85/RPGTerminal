package team.rpgterminal.server.tests;

import team.rpgterminal.cliente.Client;

import java.io.IOException;

/**
 * Created by NJSilva on 15/07/2017.
 */
public class TestClient {

    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.startClient();
            System.out.println("CLIENT HAS CONNECTED");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

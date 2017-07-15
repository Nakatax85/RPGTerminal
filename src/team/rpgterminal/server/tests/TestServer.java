package team.rpgterminal.server.tests;


import team.rpgterminal.cliente.Client;
import team.rpgterminal.server.AltServer;
import team.rpgterminal.server.Server;

import java.io.IOException;

/**
 * Created by NJSilva on 15/07/2017.
 */
public class TestServer {



    public static void main(String[] args) {
     Server server = new Server();

        server.launch(5000);

    }
}

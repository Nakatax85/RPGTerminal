package team.rpgterminal.server;

/**
 * Created by codecadet on 16/07/2017.
 */
public class ClientLauncher {
    public static void main(String[] args) {
        Client client = new Client();

        client.clientConnection();
    }
}

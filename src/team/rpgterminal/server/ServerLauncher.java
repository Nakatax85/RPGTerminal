package team.rpgterminal.server;

/**
 *  Launch Server with argument received trough command line
 */
public class ServerLauncher {


    public static void main(String[] args) {
        Server server;
       // if(args.length > 0) {
            server = new Server();
            server.launch(6969);

        //} else {
            System.out.println("Usage: java -jar RPGTerminalServer.jar [port]");
        //}
    }


}

package team.rpgterminal.server;

/**
 *  Launch Server with argument received trough command line
 */
public class ServerLauncher {

    public static void main(String[] args) {

        if(args.length > 0) {
            new Server().launch(Integer.parseInt(args[1]));
        } else {
            System.out.println("Usage: java -jar RPGTerminalServer.jar [port]");
        }
    }


}

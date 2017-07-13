package team.rpgterminal.server;

/**
 * Created by codecadet on 12/07/17.
 */

/**
 * List of Server Commands
 */
public enum ServerCommands {
    PM("/pm"),
    KICK("/kick");
    //GIVE("/give");

    private String command;

    ServerCommands(String command) {
        this.command = command;
    }

    /**
     * Determines which Server Command is at stake
     *
     * @param command           String command
     * @return                  ServerCommands
     */
    public static ServerCommands whichCommand(String command) {

        switch (command) {

            case "/pm":
                return PM;

            case "/kick":
                return KICK;

        }
        return null;

    }

    public static void listCommands() {

        for (ServerCommands sc : ServerCommands.values()) {

            System.out.println(sc);
        }

    }

}

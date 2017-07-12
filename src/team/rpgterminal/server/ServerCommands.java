package team.rpgterminal.server;

/**
 * Created by codecadet on 12/07/17.
 */

public enum ServerCommands {
    PM("/pm"),
    KICK("/kick");
    //GIVE("/give");

    private String command;

    ServerCommands(String command) {
        this.command = command;
    }

    public static ServerCommands whichCommand(String command) {

        switch (command) {

            case "/pm":
                return PM;

            case "/kick":
                return KICK;

        }
        return null;

    }

}

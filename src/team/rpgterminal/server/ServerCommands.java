package team.rpgterminal.server;

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;
import team.rpgterminal.cliente.game.playableCharacters.PlayerCommands;

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
        return ServerCommands.valueOf(command);

    }

}

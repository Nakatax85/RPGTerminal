package team.rpgterminal.cliente.game.playableCharacters;

/**
 * Created by codecadet on 12/07/17.
 */

/**
 * List of player commands
 */
public enum PlayerCommands {
    CD("cd"),
    LS("ls"),
    PICK("pick"),
    MAP("map"),
    INVENTORY("inv"),
    ATTACK("attack"),
    DEFEND("defend"),
    INTERACT("interact");

    private String command;

    PlayerCommands(String command) {
        this.command = command;
    }

    public static PlayerCommands whichCommand(String command) {
        return PlayerCommands.valueOf(command);

    }

}

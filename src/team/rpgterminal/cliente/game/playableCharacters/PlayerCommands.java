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

        switch (command) {

            case "cd":
                return CD;

            case "ls":
                return LS;

            case "pick":
                return PICK;

            case "map":
                return MAP;

            case "inv":
                return INVENTORY;

            case "attack":
                return ATTACK;

            case "defend":
                return DEFEND;

            case "interact":
                return INTERACT;

        }

        return null;

    }

}

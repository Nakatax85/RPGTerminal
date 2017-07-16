package team.rpgterminal.cliente.game.playableCharacters;

/**
 * Created by codecadet on 12/07/17.
 */

/**
 * List of Player Commands
 */
public enum PlayerCommands {
    CD("cd"),
    LS("ls"),
    PICK("pick"),
    MAP("map"),
    INVENTORY("inv"),
    ATTACK("attack"),
    DEFEND("defend"),
    INTERACT("interact"),
    MAN("man");

    private String command;

    PlayerCommands(String command) {
        this.command = command;
    }

    /**
     * Determines which Player Command is at stake
     *
     * @param command           String command
     * @return                  PlayerCommands
     */
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

            case "man":
                return MAN;

        }

        return null;

    }

    public static void listCommands() {

        for (PlayerCommands pc : PlayerCommands.values()) {
            System.out.println(pc);

        }

    }

}

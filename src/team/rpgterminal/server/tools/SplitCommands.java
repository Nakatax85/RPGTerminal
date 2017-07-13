package team.rpgterminal.server.tools;

/**
 * Created by codecadet on 13/07/17.
 */

public class SplitCommands {

    private String[] command;
    private String text = "";

    public void split(String command) {

        if (command.equals("") || (command.trim().isEmpty())) {
            System.err.println("****** Command not Found ******");
            return;
        }

        if (command.split(" ").length == 0) {
            this.command[0] = command;
            return;
        }

        this.command = command.split(" ");

    }

    public String getCommand() {

        if (command == null) {
            return null;
        }

        return command[0];
    }

    public String getActionCommand() {

        if (command.length == 1) {
            return null;
        }

        return command[1];
    }

    public String getText() {

        for (int i = 1; i < command.length; i++) {
            text = text + command[i] + " ";
        }

        return text;

    }

}

package team.rpgterminal.cliente.test;

import team.rpgterminal.cliente.game.playableCharacters.PlayerCommands;
import team.rpgterminal.server.ServerCommands;

/**
 * Created by codecadet on 12/07/17.
 */
public class TesterCommands {

    public static void main(String[] args) {

        //Tests all commands from ServerCommands
        System.out.println(ServerCommands.KICK);
        System.out.println(ServerCommands.whichCommand("/kick"));
        System.out.println(ServerCommands.whichCommand("/pm"));

        System.out.println("*******************************");

        //Tests listing method for Server Commands
        ServerCommands.listCommands();

        System.out.println("*******************************");


        //Tests all commands individually from PlayerCommands
        System.out.println(PlayerCommands.ATTACK);
        System.out.println(PlayerCommands.whichCommand("cd"));
        System.out.println(PlayerCommands.whichCommand("ls"));
        System.out.println(PlayerCommands.whichCommand("pick"));
        System.out.println(PlayerCommands.whichCommand("map"));
        System.out.println(PlayerCommands.whichCommand("inv"));
        System.out.println(PlayerCommands.whichCommand("attack"));
        System.out.println(PlayerCommands.whichCommand("defend"));
        System.out.println(PlayerCommands.whichCommand("interact"));

        System.out.println("*******************************");

        //Tests listing method Player Commands
        PlayerCommands.listCommands();

    }

}
